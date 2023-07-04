package etu1769.framework.servlet;

import java.io.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.util.List;
import java.util.LinkedList;
import java.net.URL;

import etu1769.framework.annotation.MyAnnotation;
import etu1769.framework.util.AnnotationScanner;
import etu1769.framework.util.Mapping;

public class FrontServlet extends HttpServlet {
    HashMap<String,Mapping> MappingUrls = new HashMap<>();

    public void init(){
        try {
            List<Class<?>> allClasses = AnnotationScanner.getAllClasses("test");
            for (Class<?> class1 : allClasses) {
                List<Method> annotatedMethods = AnnotationScanner.getAnnotatedMethode(class1,MyAnnotation.class);
                for (Method method : annotatedMethods) {
                    MyAnnotation annotation = class1.getMethod(method.getName()).getAnnotation(MyAnnotation.class);
                    String methodName = method.getName();
                    // URL url = new URL(annotation.Url());
                    MappingUrls.put(annotation.Url(),new Mapping(class1.getSimpleName(),methodName));
                }
                
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }
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