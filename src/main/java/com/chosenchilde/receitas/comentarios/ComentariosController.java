package com.chosenchilde.receitas.comentarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin
@RestController
@RequestMapping("/comentario")
public class ComentariosController {

	@Autowired
	private ComentariosRepository repository;

	@GetMapping
	public List<Comentarios> getAll() {

		return repository.findAll();
	}

	@GetMapping(path = "/{id}", produces = "application/json")
	public String getComentarios(@PathVariable Long id) throws JsonProcessingException {

		// Se o registro com o Id existe.
		if (repository.existsById(id)) {

			ObjectMapper mapper = new ObjectMapper();

			Comentarios comentario = repository.findById(id).get();

			return mapper.writeValueAsString(comentario);
		}

		return "{ \"status\" : \"not found\" }";
	}

	// Post
	@PostMapping
	public Comentarios post(@RequestBody Comentarios comentario) {

		// O método "save()" de JPA cria um novo registro
		// e armazena o objeto nele.
		return repository.save(comentario);
	}
	
	
	}
	

