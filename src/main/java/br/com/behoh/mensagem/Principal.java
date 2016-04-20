package br.com.behoh.mensagem;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Principal {

	public static void main(String[] args) throws IOException {

		List<Categoria> categorias = extrairCategorias();
		
		for (Categoria categoria : categorias) {
			
			if (categoria.getNome().equals("Amor")) {
				
				Document doc = Jsoup.connect(categoria.getCaminho()).get();
				
				Elements pagination = doc.select("ul.pagination.pagination-lg");
				System.out.println(pagination);
				
				Elements elements = doc.select("#posts div[class$='post']");
				
				for (Element element : elements) {

					String frase = element.select("p.frase").text();
					String caminho = element.select("a[href^='http://www.frasesdobem.com.br/frase/']").attr("href");
					String imagem = element.select("a[href^='http://www.frasesdobem.com.br/frase/'] img").attr("src");
					
					new Mensagem(frase, caminho, imagem);
					
				}
				
			}
			
		}

	}

	/**
	 * Obter as categorias de mensagens a partir do site.
	 * @param categorias
	 * @throws IOException
	 */
	private static List<Categoria> extrairCategorias() throws IOException {

		Document doc = Jsoup.connect("http://www.frasesdobem.com.br/").get();
		Elements elements = doc.select("div.sidebar ul.list2 li a");

		List<Categoria> categorias = new LinkedList<Categoria>();

		for (Element categoria : elements) {

			String nome = categoria.text();
			String caminho = categoria.attr("href");
			String titulo = categoria.attr("title");

			categorias.add(new Categoria(nome, caminho, titulo));

		}
		
		return categorias;
		
	}

}
