package org.jakartaee.servletjsptutorial;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int sum = num1 + num2;
            HttpSession session = request.getSession();
            session.setAttribute("num", sum);
            response.sendRedirect("square");
        } catch (NumberFormatException e) {
            response. getWriter().println("Invalid input. Please enter valid integers.");
        } catch (Exception e) {
            response.getWriter().println("An error occurred: " + e.getMessage());
        }

    }
}
