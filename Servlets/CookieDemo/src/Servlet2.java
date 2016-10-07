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
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Cookie c[] = request.getCookies();
        response.setContentType("text/HTML");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        for(int i=1;i<c.length;i++)
        {
            pw.println("<h1>"+c[i].getName()+" : "+c[i].getValue()+"</h1>");
        }
        pw.println("</html>");
    }
}
