package org.jakartaee.servletjsptutorial;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/square")
public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Cookie[] cookies = request.getCookies();
            int num = 0;
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("num")) {
                    num = Integer.parseInt(cookie.getValue());
                }
            }
            int square = num * num;
            response.getWriter().println("Square: " + square);
        } catch (NumberFormatException e) {
            response.getWriter().println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            response.getWriter().println("An error occurred: " + e.getMessage());
        }
    }
}
