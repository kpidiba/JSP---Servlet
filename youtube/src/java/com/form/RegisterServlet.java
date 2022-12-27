/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kpidi
 */
public class RegisterServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome to Formulaire </h2>");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_mail");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        String cond = request.getParameter("condition");

        if (cond != null) {
            out.println("<h2>Name: ".concat(name).concat("</h2>"));
            out.println("<h2>Password: ".concat(password).concat("</h2>"));
            out.println("<h2>email: ".concat(email).concat("</h2>"));
            out.println("<h2>gender: ".concat(gender).concat("</h2>"));
            out.println("<h2>course: ".concat(course).concat("</h2>"));

//            Forward Dispatcher
            RequestDispatcher rdis = request.getRequestDispatcher("Success");
            rdis.forward(request, response);
        } else {

//           Include Dispatcher
            out.println("<h2>You have not accepted terms and conditions</h2>");
            RequestDispatcher rdis = request.getRequestDispatcher("index.html");
            rdis.include(request, response);
        }

    }
}
