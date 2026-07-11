package org.jakartaee.servletjsptutorial;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            HttpSession session = request.getSession();
            int num = (int) session.getAttribute("num");
            session.removeAttribute("num");
            int square = num * num;
            response.getWriter().println("Square: " + square);
        } catch (NumberFormatException e) {
            response.getWriter().println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            response.getWriter().println("An error occurred: " + e.getMessage());
        }
    }
}
