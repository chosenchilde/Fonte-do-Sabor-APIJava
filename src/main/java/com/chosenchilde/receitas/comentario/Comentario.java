
package com.chosenchilde.receitas.comentario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comentario {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 127)
	private String authorname;
	
	@Column(length = 255)
	private String authorphoto;
	
	@Column(length = 255)
	private String authoremail;
	
	@Column(length = 255)
	private String uid;
	
	@Column(length = 127)
	private String date;
	
	@Column(length = 31)
	private String user_status;
	
	@Column
	private int recipe;
	
	@Column(columnDefinition = "TEXT")
	String comment;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getauthorname() {
		return authorname;
	}

	public void setauthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getauthorphoto() {
		return authorphoto;
	}

	public void setauthorphoto(String authorphoto) {
		this.authorphoto = authorphoto;
	}

	public String getauthoremail() {
		return authoremail;
	}

	public void setauthoremail(String authoremail) {
		this.authoremail = authoremail;
	}

	public String getuid() {
		return uid;
	}

	public void setuid(String uid) {
		this.uid = uid;
	}

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

	public int getrecipe() {
		return recipe;
	}

	public void setrecipe(int recipe) {
		this.recipe = recipe;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	
	
}
