import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Tiempo {
   public static void main(String[] args) throws IOException {
       Document doc=Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
       Elements elemento = doc.getElementsByClass("today_nowcard-temp");
       Elements clima = doc.getElementsByClass("today_nowcard-phrase");
       String titulo = doc.title();
       String texto=elemento.text();
       String frase= clima.text();
       System.out.println(titulo + "\n" + frase + "\n"+ texto);
    }
}
