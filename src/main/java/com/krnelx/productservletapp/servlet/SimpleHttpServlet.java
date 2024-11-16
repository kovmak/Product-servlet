package com.krnelx.productservletapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/simpleHttp")
public class SimpleHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(true);
            Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 1;
        } else {
            counter++;
        }
        session.setAttribute("counter", counter);

        out.println("<html><body>");
        out.println("<h1>Request Information</h1>");
        out.println("<p>Context Path: " + req.getContextPath() + "</p>");
        out.println("<p>Servlet Path: " + req.getServletPath() + "</p>");
        out.println("<p>Path Info: " + req.getPathInfo() + "</p>");
        out.println("<p>Query String: " + req.getQueryString() + "</p>");
        out.println("<p>Parameter param1: " + req.getParameter("param1") + "</p>");
        out.println("<p>Parameter param2: " + req.getParameter("param2") + "</p>");
        out.println("<p>User Agent: " + req.getHeader("User-Agent") + "</p>");
        out.println("<p>Counter: " + counter + "</p>");
        out.println("</body></html>");
    }
}