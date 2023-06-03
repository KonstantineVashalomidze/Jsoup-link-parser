import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Document doc = null;

        try{
            doc = Jsoup.connect("https://animetv.night-city.online/").get();
        } catch (IOException e){
            System.err.println("Couldn't fetch the root website HTML, reason: " + e.getMessage());
            System.exit(-1);
        }

        Elements links = doc.select("a[href]");
        for (Element link : links){
            System.out.println(link.absUrl("href"));
        }


    }
}





