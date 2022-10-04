package br.com.alura.mvc.mudi.model;


public class ColaborarModel {
	
	private int id; 
	private String nome;
	private String email;
	private String senha;
	private String cargo;
	private String biografia;
	private String url_perfil;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public String getUrl_perfil() {
		return url_perfil;
	}
	public void setUrl_perfil(String url_perfil) {
		this.url_perfil = url_perfil;
	}
	
	


}
