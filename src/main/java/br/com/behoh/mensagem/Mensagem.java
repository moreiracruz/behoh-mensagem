package br.com.behoh.mensagem;

public class Mensagem {

	private String frase;
	private String caminho;
	private String imagem;

	public Mensagem(String frase, String caminho, String imagem) {
		super();
		this.frase = frase;
		this.caminho = caminho;
		this.imagem = imagem;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}
