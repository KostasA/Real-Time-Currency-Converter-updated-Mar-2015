/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KostasA
 */
import java.net.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class URLReader {
    public static void main(String[] args) throws Exception
    {
        //URL google = new URL("https://www.google.com/finance/converter?a=2&from=USD&to=EUR&meta=");
        Document doc = Jsoup.connect("https://www.google.com/finance/converter?a=1&from=USD&to=EUR&meta=").get();
        Elements test = doc.select("span");
        String[] p = test.text().split(" ");
        System.out.println(p[0]);
        /*BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
        String inputLine;
        while((inputLine = in.readLine()) !=null)
        {
                System.out.println(inputLine);
        }
        in.close(); */
    }
    
}
