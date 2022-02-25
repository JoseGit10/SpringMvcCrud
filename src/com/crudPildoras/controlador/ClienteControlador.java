package com.crudPildoras.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.crudPildoras.dao.ClienteDao;
import com.crudPildoras.entity.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteControlador {
	
	@Autowired
	private ClienteDao implCliente;

	
	@RequestMapping("/mostrar")
	public String mostrarCliente(Model modelo) {
		//Se crea la lista y se llama al Dao para añadir a la lista
		List<Cliente> listCliente = implCliente.listarCliente();
		//se agrega el atributo para mostrarlo en la vista
		modelo.addAttribute("clientes",listCliente);
		//Retornamos la vista
		return "mostrarCliente";
	}
	
	@RequestMapping("/agregar")
	public String mostrarFormCliente(Model modelo) {
		//Se realiza la instancia de cliente
		Cliente clt = new Cliente();
		//Se añade al model para que el tome el nuevo cliente
		modelo.addAttribute("clienteNew",clt);
		
		return "addCliente";
	}
	
	@PostMapping("/insertarCliente")
	public String addCliente(@ModelAttribute("clienteNew") Cliente clt) {
		implCliente.addCliente(clt);
		return "redirect:/cliente/mostrar";
	}
	
	@GetMapping("/buscarCliente")
	public String buscarCliente(@RequestParam("cltId")int clienteId, Model modelo) {
		//realizar busqueda del cliente
		Cliente clt = implCliente.searchClientbyId(clienteId);
		modelo.addAttribute("clienteUpdate",clt);
		
		return "updateCliente";
	}
	
	@PostMapping("/actualizarCliente")
	public String updateCliente(@ModelAttribute("clienteUpdate") Cliente clt) {
		implCliente.updateCliente(clt);
		return "redirect:/cliente/mostrar";
	}
	
	
	@GetMapping("/eliminarCliente")
	public String deleteCliente(@RequestParam("cltId") int clienteId) {
		implCliente.deleteCliente(clienteId);
		return "redirect:/cliente/mostrar";
	}
	
}
