import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * CookieDemo
 * Created by Aditya Gholba on 16/8/16.
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
        Cookie ck = new Cookie("Username",uname);
        response.addCookie(ck);
        response.setContentType("text/HTML");
        PrintWriter pw = response.getWriter();
        pw.println("<html><form action='/2'><input type='submit'></form></html>");
    }
}
