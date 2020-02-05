import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Tiempo {
   public static void main(String[] args) throws IOException {
       Document doc=Jsoup.connect("http://www.google.com").userAgent("Mozilla").get();
       Elements elemento = doc.getElementsByClass("today_nowcard-temp");
       //elemento
       System.out.println(elemento.toString());
    }
}
