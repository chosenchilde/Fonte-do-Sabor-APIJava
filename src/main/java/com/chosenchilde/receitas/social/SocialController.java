package com.chosenchilde.receitas.social;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/usuario/social")
public class SocialController {

	@Autowired
	private SocialRepository repository;

	// Retorna um usuário do FireBase pelo Id. Exemplo:
	// GET → http://localhost:8080/usuario/social/1
	@GetMapping("/{userId}")
	public List<Social> getSocial(@PathVariable Long userId) {
		return repository.findByUser(userId);
	}

}
