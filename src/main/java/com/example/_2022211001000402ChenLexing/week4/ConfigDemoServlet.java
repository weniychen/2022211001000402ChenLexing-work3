package com.example._2022211001000402ChenLexing.week4;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(
        name="ConfigDemoServlet",value = "/config",
        initParams = {
                @WebInitParam( name="name1",value = "ChenLexing"),
                @WebInitParam(name = "id1",value = "2022211001000402")
        }

)
public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config=getServletConfig();
        String name=config.getInitParameter("name");
        String id=config.getInitParameter("id");
        String name1=config.getInitParameter("name");
        String id1=config.getInitParameter("id");
        PrintWriter writer=response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + "Task 1-Get init parameters from web.xml" + "</h1>");
        writer.println("<br>name: "+name);
        writer.println("<br>studentID: "+id);
        writer.println("<html><body>");
        writer.println("<h1>" + "Task 2-Get init parameters from @WebServlet" + "</h1>");
        writer.println("<br>name: "+name1);
        writer.println("<br>studentID: "+id1);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
