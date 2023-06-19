package com.chosenchilde.receitas.receita;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReceitaController {

	@Autowired
	private ReceitaRepository repository;

	@GetMapping
	public List<Receita> getAll() {

		return repository.findAll();
	}

	@GetMapping(path = "/{id}", produces = "application/json")
	public String getReceita(@PathVariable Long id) throws JsonProcessingException {

		// Se o registro com o Id existe.
		if (repository.existsById(id)) {

			ObjectMapper mapper = new ObjectMapper();

			Receita receita = repository.findById(id).get();

			return mapper.writeValueAsString(receita);
		}

		return "{ \"status\" : \"not found\" }";
	}
	
	@PostMapping
	public Receita post(@RequestBody Receita receita) {

		// O método "save()" de JPA cria um novo registro
		// e armazena o objeto nele.
		return repository.save(receita);
	}
	
	
	@PatchMapping(path = "/{id}", produces = "application/json")
	public String updatePartial(@PathVariable Long id, @RequestBody Receita receita) throws JsonProcessingException {

		// Se o registro com o Id existe.
		if (repository.existsById(id)) {

			// Obtém o registro do banco e armazena em "original".
			Receita original = repository.findById(id).get();
			
			receita = original;

			receita.setRcp_view(original.getRcp_view() +1);
			

			// Salva o registro atualizado.
			repository.save(receita);

			// Retorna o registro atualizado usando o método GET.
			// Nota: adicione "throws JsonProcessingException" ao método "updateAll()".
			return  getReceita(id);

		}

		// Se o registro não existe, retorna o JSON.
		return "{ \"status\" : \"not found\" }";

	}

}
