package br.com.desafio.dio.poo;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosConluidos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

	public void inscreverBootcamp(Bootcamp bootcamp) {}
	
	public void progredir() {}
	
	public void calcularXp() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosConluidos() {
		return conteudosConluidos;
	}

	public void setConteudosConluidos(Set<Conteudo> conteudosConluidos) {
		this.conteudosConluidos = conteudosConluidos;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConluidos, other.conteudosConluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}

}