/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.david;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kpidi
 */

@WebServlet("/ServeltPage")
public class ServletPage extends HttpServlet {
    /*
    * @param request servlet request
    * @param response
    * @throws ServletException
    * @throws IOException
     */
    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!Doctype html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Page</title>");
            out.println("</head>");
            out.println("<body>");

            String name = request.getParameter("name");

            Cookie[] cok = request.getCookies();
            out.println("<h1> Hello to my website " + cok[0].getValue() + ".... </h1>");
            out.println("<h2> <a href='/Sessions' >session home</a> </h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
