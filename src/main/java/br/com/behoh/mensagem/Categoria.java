package br.com.behoh.mensagem;

public class Categoria {

	private String nome;
	private String caminho;
	private String titulo;

	public Categoria(String nome, String caminho, String titulo) {
		super();
		this.nome = nome;
		this.caminho = caminho;
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
