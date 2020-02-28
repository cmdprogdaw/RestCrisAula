package com.cris.restCris.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioRutas {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	
	
	@GetMapping("/usuarios")
	public List<Usuario> usuarios() {
		
		List<Usuario> listaUsuarios = (List<Usuario>)usuarioDAO.findAll();
		
		return listaUsuarios;
	}
	
	
	
	@GetMapping("/usuario/{id}")
	public Usuario usuarioDetalle(@PathVariable String id) {
		
		Usuario user = usuarioDAO.findById(id).get();
		
		return user;
	}
	
	
	
}
