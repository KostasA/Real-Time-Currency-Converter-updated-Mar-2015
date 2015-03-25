package com.code;

import javax.servlet.*;

public class MyServletContextListenerCode implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent event)
    {
        ServletContext sc = event.getServletContext();
        String code_source = sc.getInitParameter("code");
        Code code = new Code(code_source);
        sc.setAttribute("redirect_code", code);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

