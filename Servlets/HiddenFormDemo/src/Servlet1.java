import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * HiddenFormDemo
 * Created by Aditya Gholba on 22/8/16.
 */
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String hidden1 = request.getParameter("username");
        String hidden2 = request.getParameter("password");
        response.setContentType("text/HTML");
        PrintWriter pw = response.getWriter();
        pw.println("<html><h1>"+hidden1+"</h1><form action='2' method='get'><input type='hidden' name='hidden' value='"+hidden1+"'><input type='submit' value='Servlet 2'></form></html>");

    }
}
