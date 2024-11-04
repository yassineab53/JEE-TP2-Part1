package net.yassine.demo;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.time.LocalDate;
import java.util.*;

@WebServlet(name = "bonjourServlet", value = "/bonjour-servlet")
public class Bonjour extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter p = response.getWriter();


        p.print("<!DOCTYPE html>");
        p.print("<html lang='fr'>");
        p.print("<head>");
        p.print("<meta charset='UTF-8'>");
        p.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        p.print("<title>Bonjour Servlet</title>\n");


        //p.print("<style>");
        //p.print("body { font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; margin: 0; background-color: #f0f0f5; }");
        //p.print("h1 { color: #333; font-size: 3em; letter-spacing: 2px; background: linear-gradient(45deg, #4A90E2, #9013FE); -webkit-background-clip: text; color: transparent; }");

        //p.print("</style>");

        p.print("</head>");
        p.print("<body>");

        p.print("<h1>Bonjour Servlet</h1>");
        //LocalDate today = LocalDate.now();
        Date today = new Date();
        p.print("<h2>la date est : </h2>");
        p.print("<h5>" + today +"</h5>   ");

        //Exercices
        //qst1
        p.print("<table border='1' style='width: 100%; border-collapse: collapse ;position: absolute; top : 400px; left: 0;'>");
        for(int i = 0 ; i < 10 ; i++){
            p.print("<tr>");
            for(int j = 0 ; j < 3 ; j++){
                p.print(
                        "    <td>ligne " + i + ",  colone " + j  +  " </td>\n"
                        );
            }
            p.print("</tr>\n");
        }
        p.print("</table>");

        p.print("</body>");
        p.print("</html>");


        p.close();
    }
}
