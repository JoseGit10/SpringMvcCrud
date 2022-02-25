package com.crudPildoras.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.crudPildoras.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClienteDaoImpl implements ClienteDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Cliente> listarCliente() {
		Session session = sessionFactory.getCurrentSession();
		Query<Cliente> consulta = session.createQuery("FROM Cliente",Cliente.class);
		List<Cliente> listCliente = consulta.getResultList() ;
		return listCliente;
	}

	@Override
	@Transactional
	public void addCliente(Cliente clt) {
		Session sesion = sessionFactory.getCurrentSession(); 
		sesion.save(clt);
	}

	@Override
	@Transactional
	public Cliente searchClientbyId(int clienteId) {
		Session sesion = sessionFactory.getCurrentSession();
		Cliente clt = sesion.get(Cliente.class, clienteId);
		return clt;
	}

	@Override
	@Transactional
	public void updateCliente(Cliente clt) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(clt);
	}

	@Override
	@Transactional
	public void deleteCliente(int cltId) {
		Session sesion = sessionFactory.getCurrentSession();
		Cliente clt = searchClientbyId(cltId);
		sesion.delete(clt);
	}

	
	
}
