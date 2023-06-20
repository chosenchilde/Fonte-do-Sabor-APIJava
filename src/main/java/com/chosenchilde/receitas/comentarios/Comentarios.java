
package com.chosenchilde.receitas.comentarios;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comentarios {
 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cmt_id;
	
	@Column(length = 127)
	private String cmt_authorname;
	
	@Column(length = 255)
	private String cmt_authorphoto;
	
	@Column(length = 255)
	private String cmt_authoremail;
	
	@Column(length = 255)
	private String cmt_uid;
	
	@Column(length = 127)
	private String cmt_date;
	
	@Column
	private int cmt_recipe;
	
	public Long getCmt_id() {
		return cmt_id;
	}

	public void setCmt_id(Long cmt_id) {
		this.cmt_id = cmt_id;
	}

	public String getCmt_authorname() {
		return cmt_authorname;
	}

	public void setCmt_authorname(String cmt_authorname) {
		this.cmt_authorname = cmt_authorname;
	}

	public String getCmt_authorphoto() {
		return cmt_authorphoto;
	}

	public void setCmt_authorphoto(String cmt_authorphoto) {
		this.cmt_authorphoto = cmt_authorphoto;
	}

	public String getCmt_authoremail() {
		return cmt_authoremail;
	}

	public void setCmt_authoremail(String cmt_authoremail) {
		this.cmt_authoremail = cmt_authoremail;
	}

	public String getCmt_uid() {
		return cmt_uid;
	}

	public void setCmt_uid(String cmt_uid) {
		this.cmt_uid = cmt_uid;
	}

	public String getCmt_date() {
		return cmt_date;
	}

	public void setCmt_date(String cmt_date) {
		this.cmt_date = cmt_date;
	}

	public int getCmt_recipe() {
		return cmt_recipe;
	}

	public void setCmt_recipe(int cmt_recipe) {
		this.cmt_recipe = cmt_recipe;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	@Column(length = 31)
	private String user_status;
	
}
