package com.chosenchilde.receitas.receita;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Receita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rcp_id;

	@Column(length = 127)
	private String name;

	@Column(length = 255)
	private String rcp_img;

	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String rcp_content;

	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String ingredients;

	@Column
	private int rcp_view;

	@Column(length = 31)
	private String rcp_status;

	@Column
	private int rcp_author;

	public Long getRcp_id() {
		return rcp_id;
	}

	public void setRcp_id(Long rcp_id) {
		this.rcp_id = rcp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRcp_img() {
		return rcp_img;
	}

	public void setRcp_img(String rcp_img) {
		this.rcp_img = rcp_img;
	}

	public String getRcp_content() {
		return rcp_content;
	}

	public void setRcp_content(String rcp_content) {
		this.rcp_content = rcp_content;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public int getRcp_view() {
		return rcp_view;
	}

	public void setRcp_view(int rcp_view) {
		this.rcp_view = rcp_view;
	}

	public String getRcp_status() {
		return rcp_status;
	}

	public void setRcp_status(String rcp_status) {
		this.rcp_status = rcp_status;
	}

	public int getRcp_author() {
		return rcp_author;
	}

	public void setRcp_author(int rcp_author) {
		this.rcp_author = rcp_author;
	}

}
