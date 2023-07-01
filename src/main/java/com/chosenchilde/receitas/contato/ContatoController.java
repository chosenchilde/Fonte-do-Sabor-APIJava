package com.chosenchilde.receitas.contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoRepository repository;
	
	@PostMapping
	public Contato post(@RequestBody Contato contato) {

		// O método "save()" de JPA cria um novo registro
		// e armazena o objeto nele.
		return repository.save(contato);
	}
}
