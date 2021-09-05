package com.lucas313.AluraRESTAPI.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Resposta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String mensagem;
	
	@ManyToOne
	private Topico topico;
	private LocalDateTime dataCriacao;
	
	@ManyToOne
	private Usuario autor;
	private Boolean solucao = false;
	
	public Resposta() {
	}

	public Resposta(Long id, String mensagem, Topico topico, LocalDateTime dataCriacao, Usuario autor,
			Boolean solucao) {
		super();
		this.id = id;
		this.mensagem = mensagem;
		this.topico = topico;
		this.dataCriacao = dataCriacao;
		this.autor = autor;
		this.solucao = solucao;
	}

	public Long getId() {
		return id;
	}


	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Topico getTopico() {
		return topico;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public Usuario getAutor() {
		return autor;
	}


	public Boolean getSolucao() {
		return solucao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resposta other = (Resposta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
