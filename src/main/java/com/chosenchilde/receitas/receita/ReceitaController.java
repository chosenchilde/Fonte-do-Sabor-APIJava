package com.chosenchilde.receitas.receita;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.luferat.java.demoapi1.frontendeiros.articles.Article;

@CrossOrigin
@RestController
@RequestMapping("/receita")
public class ReceitaController {

	@Autowired
	private ReceitaRepository repository;

	// Busca todas as receitas.
	@GetMapping
	public List<Receita> getAll() {
		return repository.findAll();
	}

	// Busca todas as receitas mais vizualizadas.
	@GetMapping("/home/{limit}")
	public List<Receita> getByViews(@PathVariable int limit) {
		return repository.findRecipeWithLimit(limit);
	}

	// Busca receitas pelo id
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

	// Envio de receitas ( postagem de novas receitas)
	@PostMapping
	public Receita post(@RequestBody Receita receita) {

		// O método "save()" de JPA cria um novo registro
		// e armazena o objeto nele.
		return repository.save(receita);
	}

	// Atualiza as visualizações.
	@PatchMapping(path = "/{id}", produces = "application/json")
	public String updateViews(@PathVariable Long id) {
		repository.updateViews(id);
		return "{\"status\": \"success\"}";
	}

	// Busca por uma palavra ou termo nos campos "title", "resume" e "content".
	// As buascas são "case-insensitive". Por exemplo, para procurar por "Biscoito":
	// GET → http://domain.api/articles/find?q=Biscoito
	@GetMapping(path = "/search")
	public List<Receita> findArticleByWord(@RequestParam("q") String q) {
		return repository.findByWord(q);
	}

	// Obtém as receitas do autor.
	// Observe que a rota contém 3 parâmetros numéricos:
	// {uid} → Id do autor da receita
	// {rcp} → Id da receita que será excluído da listagem
	// {lim} → Quantas receitas serão obtidas
	// Exemplo de rota: http://domain.api/receita/author?uid=1&rcp=2&lim=5
	@GetMapping(path = "/author")
	public List<Receita> getByAuthor(@RequestParam("uid") Long uid, @RequestParam("rcp") Long receitaId,
			@RequestParam("lim") int limit) {
		return repository.findAllByAuthor(uid, receitaId, limit);
	}

}
