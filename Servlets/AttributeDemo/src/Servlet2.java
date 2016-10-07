import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;

/*
 * AttributeDemo
 * Created by Aditya Gholba on 8/8/16.
 */
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String print = (String) getServletContext().getAttribute("Servlet2");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><h1>"+print+"</h1><html>");
    }
}
