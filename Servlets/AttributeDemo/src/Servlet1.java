import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * AttributeDemo
 * Created by Aditya Gholba on 8/8/16.
 */
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ServletContext sc = getServletContext();
        sc.setAttribute("Servlet2","Hello Servlet2");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><h1>Setting Attribute !</h1><html>");
    }
}
