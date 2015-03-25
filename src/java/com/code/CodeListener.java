package com.code;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CodeListener extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Code code = (Code)getServletContext().getAttribute("redirect_code");
		response.sendRedirect(code.getCode());
	}
    
}