package com.chosenchilde.receitas.receita;

import com.chosenchilde.receitas.usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Receita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rid;
	private String rdate;
	
	@ManyToOne
	@JoinColumn(name = "rauthor")
	private Usuario rauthor;

	@Column(length = 127)
	private String rname;

	@Column(length = 255)
	private String rimg;

	@Lob
	@Column(columnDefinition = "LONGTEXT", length = 65535)
	private String rcontent;

	@Lob
	@Column(columnDefinition = "LONGTEXT", length = 65535)
	private String ringredients;

	@Column
	private int rview;

	@Column(length = 31)
	private String rstatus;
	

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRimg() {
		return rimg;
	}

	public void setRimg(String rimg) {
		this.rimg = rimg;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public String getRingredients() {
		return ringredients;
	}

	public void setRingredients(String ringredients) {
		this.ringredients = ringredients;
	}

	public int getRview() {
		return rview;
	}

	public void setRview(int rview) {
		this.rview = rview;
	}

	public String getRstatus() {
		return rstatus;
	}

	public void setRstatus(String rstatus) {
		this.rstatus = rstatus;
	}

	public Usuario getRauthor() {
		return rauthor;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public void setRauthor(Usuario rauthor) {
		this.rauthor = rauthor;
	}

}
