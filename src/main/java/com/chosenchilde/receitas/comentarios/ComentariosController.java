package com.chosenchilde.receitas.comentarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	// Busca po um comentário específico.
	// Exemplo:
	// GET →
	// http://domínio.api/comments/find?uid=Q1W2E3R4T5Y6U7&art=2&txt=Comentário do
	// usuário
	// Busca por comentários que contenham exatamente
	// Id do usuário = "Q1W2E3R4T5Y6U7" E
	// Id do artigo = 2 E
	// Texto do comentário = "Comentário do usuário"
	// Serve para evitar que um mesmo comentário seja enviado de forma repetida.
	@GetMapping(path = "/find")
	public List<Comentarios> alreadyExists(@RequestParam("uid") String uid, @RequestParam("art") Long art,
			@RequestParam("txt") String txt) {
		return repository.findComentariosByUsuarioAndReceita(uid, art, txt);
	}

}
