package com.info;

import javax.servlet.*;

public class MyServletContextListenerInfo implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent event)
    {
        ServletContext sc = event.getServletContext();
        String info_source = sc.getInitParameter("info");
        Info info = new Info(info_source);
        sc.setAttribute("redirect_info",info);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

