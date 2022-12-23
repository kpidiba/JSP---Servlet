/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kpidi
 */
public class SecondServlet extends GenericServlet {

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        System.out.println("This is servlet using generic servlet");
        sr1.setContentType("text/html");
         PrintWriter out = sr1.getWriter();
        out.println("<h1>Second base url</h1>");
        out.println("<p>Second Servlet</p>");
    }
    
}
