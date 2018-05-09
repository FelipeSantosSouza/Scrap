package org.Scrap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {

	public static void main(String[] args) throws Exception {
		final Document documento = Jsoup.connect("https://www.imdb.com/chart/top").get();

		for(Element row: documento.select("table.chart.full-width tr")) {
			final String titulo = row.select(".titleColumn a").text();
			final String classificacao = row.select(".imdbRating").text();

			System.out.println("Titulo: "+ titulo + " Classificacao: "+ classificacao);
			
			
		}
	}

}
