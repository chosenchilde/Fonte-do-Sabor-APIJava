package Receita;

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
	private String rcp_name;

	@Column(length = 255)
	private String rcp_img;

	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String rcp_content;

	public Long getRcp_id() {
		return rcp_id;
	}

	public void setRcp_id(Long rcp_id) {
		this.rcp_id = rcp_id;
	}

	public String getRcp_name() {
		return rcp_name;
	}

	public void setRcp_name(String rcp_name) {
		this.rcp_name = rcp_name;
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

	public String getRcp_ingredients() {
		return rcp_ingredients;
	}

	public void setRcp_ingredients(String rcp_ingredients) {
		this.rcp_ingredients = rcp_ingredients;
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

	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String rcp_ingredients;

	@Column
	private int rcp_view;

	@Column(length = 31)
	private String rcp_status;

	@Column
	private int rcp_author;

}
