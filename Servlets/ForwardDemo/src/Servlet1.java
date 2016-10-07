import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ForwardDemo
 * Created by Aditya Gholba on 9/8/16.
 */
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       // String uname = request.getParameter("username");
       // String pwd = request.getParameter("password");
        if(request.getParameter("username").equalsIgnoreCase("ADitya") && request.getParameter("password").equalsIgnoreCase("Aditya123"))
        {
            RequestDispatcher rd =
        }
        PrintWriter pw = response.getWriter();
        pw.println("<html><h1>"+uname+"</h1><h2>"+pwd+"</h2></html>");
        pw.println("Testing");
    }
}
