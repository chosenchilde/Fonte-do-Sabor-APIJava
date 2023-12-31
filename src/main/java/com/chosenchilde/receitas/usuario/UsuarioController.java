package com.chosenchilde.receitas.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	// Retorna uma lista de todos os usuários.
	@GetMapping
	public List<Usuario> getAll() {
		return repository.findAllUsers();
	}

	// Retorna um usuário pelo id. Exemplo:
	// GET → http://localhost:8080/usuario/1
	@GetMapping(path = "/{id}", produces = "application/json")
	public String getUsuario(@PathVariable Long id) throws JsonProcessingException {

		// Se o registro com o Id existe.
		if (repository.existsById(id)) {

			ObjectMapper mapper = new ObjectMapper();

			Usuario usuario = repository.findById(id).get();

			return mapper.writeValueAsString(usuario);
		}

		return "{ \"status\" : \"not found\" }";
	}

	// Post
	/*
	 * @PostMapping
	 
	 public Usuario post(@RequestBody Usuario usuario) {

		// O método "save()" de JPA cria um novo registro
		// e armazena o objeto nele.
		return repository.save(usuario);
	} */

	
}
