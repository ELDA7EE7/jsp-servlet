package org.jakartaee.servletjsptutorial;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;

import java.io.IOException;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int sum = num1 + num2;
            Cookie cookie = new Cookie("num", String.valueOf(sum));
            response.addCookie(cookie);
            response.sendRedirect("square");
        } catch (NumberFormatException e) {
            response. getWriter().println("Invalid input. Please enter valid integers.");
        } catch (Exception e) {
            response.getWriter().println("An error occurred: " + e.getMessage());
        }

    }
}
