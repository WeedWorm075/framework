package etu1769.framework.servlet;

import java.io.*;
import java.util.HashMap;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FrontServlet extends HttpServlet {
    HashMap MappingUrls;
    public HashMap getMappingUrls() {
        return MappingUrls;
    }
    public void setMappingUrls(HashMap mappingUrls) {
        MappingUrls = mappingUrls;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.getWriter().println("ok");
    }
}