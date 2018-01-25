package br.com.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.locadora.model.Cliente;
import br.com.locadora.repository.ClienteRepositorty;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepositorty repository;
	
	public void save(Cliente cliente) {
		repository.save(cliente);
	}
	
	public void remover(Long idCliente) {
		repository.delete(idCliente);
	}
	
	public List<Cliente> listar(){
		return repository.findAll();
	}
	
	public void update(Cliente cliente) {
		repository.saveAndFlush(cliente);
	}

}
