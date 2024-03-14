package com.example._2022211001000402ChenLexing;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
            PrintWriter writer = response.getWriter();
        writer.println("Name:Chen Lexing");
        writer.println("ID:2022211001000402");
        writer.println("Date and Time: Thu Mar 14 12:33:40 CST 2024");
        }


    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
