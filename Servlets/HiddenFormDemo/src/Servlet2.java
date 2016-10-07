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
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String hidden1 = request.getParameter("hidden");
        response.setContentType("text/HTML");
        PrintWriter pw = response.getWriter();
        pw.println("<html><h1>Hidden value is : "+hidden1+"</html>");

    }
}
