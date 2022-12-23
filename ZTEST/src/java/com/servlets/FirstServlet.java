package com.servlets;


import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.config = sc;
        System.out.println("create object ....");
    }

    @Override
    public ServletConfig getServletConfig() {
            return this.config;
    }

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        System.out.println("Servicing ...");
        //set content type of response
        sr1.setContentType("text/html");
        PrintWriter out = sr1.getWriter();
        out.println("<h1>Second base url</h1>");
        out.println("<p>Hello world</p>");
    }

    @Override
    public String getServletInfo() {
        return "this servlet is created by david florento";
    }

    @Override
    public void destroy() {
        System.out.println("destroy servlet object.....");
    }

}
