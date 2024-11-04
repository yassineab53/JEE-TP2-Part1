package net.yassine.demo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")   // a partir de la version 3.0
// @WebServlet(name="cs", urlPatterns = {"/hello", "*.do"})
public class HelloServlet extends HttpServlet { // HelloServlet = ControllerServelet
    private String message;

    public void init() {
        message = "Hello Yassine";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>\n" +
                "        <style>\n" +
                "                body {\n" +
                "            background-color: linen;\n" +
                "        }\n" +
                "\n" +
                "        h1 {\n" +
                "            text-align: center;\n" +
                "            color: maroon;\n" +
                "            margin-left: 40px;\n" +
                "        }\n" +
                "        </style>");

        /*<head>
        <style>
                body {
            background-color: linen;
        }

        h1 {
            color: maroon;
            margin-left: 40px;
        }
        </style> */
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        out.close();
    }

    public void destroy() {
    }
}