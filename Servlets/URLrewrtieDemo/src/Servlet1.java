import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/*
 * URLrewrtie
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
        String uname = request.getParameter("username");
        String pswd = request.getParameter("password");

        response.setContentType("text/HTML");
        PrintWriter pw = response.getWriter();
        pw.println("<html><h1>"+uname+"</h1><h3><a href='/2?uname="+uname+"&password="+pswd+"'>Servlet 2</a> </h3></html>");
    }
}
