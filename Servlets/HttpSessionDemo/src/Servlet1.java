import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * HttpSession
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

        HttpSession hs = request.getSession();
        hs.setAttribute("uname",uname);
        PrintWriter pw = response.getWriter();
        pw.println("<html><h3><a href='/2'>Click me </a> </h3></html>");
    }
}
