package com.codeup.adlister.controllers;

import com.mysql.cj.jdbc.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }









    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        PrintWriter out = response.getWriter();
        String connectionURL = "jdbc:mysql://localhost/adlister_db";
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String username = request.getParameter("user");
        String password = request.getParameter("password");
        response.setContentType("text/html");
// TODO: ensure the submitted information is valid
        try {
            // Load the database driver
            Class.forName("com.mysql.jdbc.Driver");
            //Add the data into the database
            String sql = "SELECT * FROM login WHERE userid = ? AND password = ?";

            stmt = (PreparedStatement) connection.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            rs = stmt.getResultSet();
// TODO: create a new user based off of the submitted information
            if(rs.next()) {
                // redirect or print but not both...
                out.println("The user is valid");
                // response.sendRedirect("index_true.jsp");
            } else {
                out.println("You are not valid");
            }
        } catch(Exception e) {
            System.out.println("Exception is: " + e);
        } finally {
// TODO: if a user was successfully created, send them to their profile
            response.sendRedirect("/login");

        }
    }
}
