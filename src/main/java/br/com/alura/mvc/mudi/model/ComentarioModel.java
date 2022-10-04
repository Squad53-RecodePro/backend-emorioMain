package br.com.alura.mvc.mudi.model;

import java.util.Date;

public class ComentarioModel {
	
	private int id;
	private int id_visitante;
	private String conteudo;
	private Date dt_criacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_visitante() {
		return id_visitante;
	}
	public void setId_visitante(int id_visitante) {
		this.id_visitante = id_visitante;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Date getDt_criacao() {
		return dt_criacao;
	}
	public void setDt_criacao(Date dt_criacao) {
		this.dt_criacao = dt_criacao;
	}
	
	
                 
}
