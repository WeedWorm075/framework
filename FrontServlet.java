package etu1769.framework.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FrontServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.getWriter().println("ok");
    }
}