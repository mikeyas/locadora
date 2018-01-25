package br.com.locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.locadora.model.Cliente;
import br.com.locadora.service.ClienteService;


@Controller
public class ClienteController {
	
	public static String LISTAR_CLIENTES = "/clientes/clientes";
	
	public static String CADASTRAR_CLIENTES = "/clientes/addCliente";
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(LISTAR_CLIENTES);
		List<Cliente> clientes = clienteService.listar();
		mv.addObject("clientes",clientes);
		return mv;
	}
	
	public ModelAndView remover() {
		ModelAndView mv = new ModelAndView(LISTAR_CLIENTES);
		
		return mv;
	}
	
	public ModelAndView salvar(Cliente cliente) {
		ModelAndView mv = new ModelAndView(CADASTRAR_CLIENTES);
		clienteService.save(cliente);
		mv.addObject("cliente", cliente);
		return mv;
	}
	
	public ModelAndView editar(Cliente cliente) {
		ModelAndView mv = new ModelAndView(CADASTRAR_CLIENTES);
		
		
		return mv;
	}


}
