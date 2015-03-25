package com.info;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InfoListener extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Info info = (Info)getServletContext().getAttribute("redirect_info");
		response.sendRedirect(info.getInfo());
	}
    
}
