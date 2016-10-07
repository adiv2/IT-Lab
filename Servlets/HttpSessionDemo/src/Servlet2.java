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
 * Created by Aditya Gholba on 23/8/16.
 */
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession hs = request.getSession(false);
        String uname = hs.getAttribute("uname").toString();
        PrintWriter pw = response.getWriter();
        if(uname!=null)
        {pw.println("<html><h1>Session is valid for: "+uname+"</h1></html>");}

    }
}
