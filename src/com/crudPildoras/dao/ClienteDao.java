package com.crudPildoras.dao;

import java.util.List;
import com.crudPildoras.entity.Cliente;

public interface ClienteDao {
	
	public List<Cliente> listarCliente();

	public void addCliente(Cliente clt);
	
	public Cliente searchClientbyId(int clienteId);
	
	public void updateCliente(Cliente clt);
	
	public void deleteCliente(int cltId);
}
