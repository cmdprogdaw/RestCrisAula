package com.cris.restCris.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	ResponseEntity<Usuario> usuarioDetalle(@PathVariable String id) {
		
		Optional<Usuario> user = usuarioDAO.findById(id);
		
		if(user.isPresent()) {
			
			return new ResponseEntity<Usuario>(user.get(), HttpStatus.OK);
		}
		else return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
	}
	
	
	
//	@GetMapping("/usuario/{id}")
//	public Usuario usuarioDetalle(@PathVariable String id) {
//		
//		Usuario user = usuarioDAO.findById(id).get();
//		
//		return user;
//	}
	
	
	
//	@GetMapping("/usuario/{id}")
//	Usuario usuarioDetalle(@PathVariable String id) throws UsuarioNotFoundException{;
//		
//		return usuarioDAO.findById(id).get().orElseThrow(() -> new UsuarioNotFoundException(id));
//	}
	
	
	
}
