package com.chosenchilde.receitas.coments;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comentarios {
 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
}
