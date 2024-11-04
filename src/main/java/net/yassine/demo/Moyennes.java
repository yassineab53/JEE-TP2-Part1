package net.yassine.demo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.lang.Math;
import java.util.ArrayList;

/**
 * @author $ {USER}
 **/
@WebServlet(name = "moyennes", value = "/moyennses")
public class Moyennes extends HttpServlet {
    //@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Moyennes</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Etudiants et moyennes </h1>");
        /*out.print("<table>");*/
        out.print("<table border='1' style='width: 100%; border-collapse: collapse ;position: absolute; top : 100px; left: 0;'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>Nom</th>");
        out.print("<th>Moyenne</th>");
        out.print("</tr>");
        out.print("</thead");
        out.print("<tbody>");
        ArrayList<String> arr = new ArrayList<>(5);
        arr.add("Yassine");
        arr.add("Ayoub");
        arr.add("Amine");
        arr.add("Oussama");
        arr.add("Aymane");
        for(int i = 0 ; i < 5 ; i++){
            out.print("<tr>");
            out.print("<td>" + arr.get(i) + "</td>");
            out.print("<td>"+Math.random()+"</td>");
        }
        out.print("</tbody>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
