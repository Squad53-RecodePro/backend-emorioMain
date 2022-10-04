package br.com.alura.mvc.mudi.model;

public class ProjetoModel {

	private int id;
	private int id_beneficiado;
	private int id_colaborador;
	private String nome;
	private String descricao;
	private String atuacao;
	private String url_perfil;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_beneficiado() {
		return id_beneficiado;
	}
	public void setId_beneficiado(int id_beneficiado) {
		this.id_beneficiado = id_beneficiado;
	}
	public int getId_colaborador() {
		return id_colaborador;
	}
	public void setId_colaborador(int id_colaborador) {
		this.id_colaborador = id_colaborador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAtuacao() {
		return atuacao;
	}
	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}
	public String getUrl_perfil() {
		return url_perfil;
	}
	public void setUrl_perfil(String url_perfil) {
		this.url_perfil = url_perfil;
	}
	
	
	
}
