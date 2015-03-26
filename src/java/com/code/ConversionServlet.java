package com.code;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class ConversionServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.setContentType("text/html");
            response.setHeader("Cache-Control","no-cache");
            PrintWriter out = response.getWriter();
            String am = request.getParameter("amount");
            String in = request.getParameter("initial_currency");
            String fi = request.getParameter("final_currency");
            Document doc = Jsoup.connect("https://www.google.com/finance/converter?a="+am+"&from="+in+"&to="+fi+"&meta=").get();
            Elements test = doc.select("span");
            String[] p = test.text().split(" ");
            out.println(p[0].substring(0,4));          
        } catch (IOException io)
        {
            io.printStackTrace();
        }
        
                
    }
    public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
     doGet(request, response);
  }
    
}
