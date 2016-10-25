import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

/*
 * ForwardDemo
 * Created by Aditya Gholba on 9/8/16.
 */
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet
{
    String pswd;
    String uname;
    private void readDB() throws ClassNotFoundException , SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/IT","root","aditya123");
        Statement stmt=con.createStatement();
        String sql = "select password from login where username=\""+uname+"\"";
        System.out.println(sql);
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next())
        {
            pswd = rs.getString("password");
        }
        System.out.println(pswd);
        con.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       uname = request.getParameter("username");
       //String pwd = request.getParameter("password");
       try
       {
           readDB();
           System.out.println(pswd);
       }catch (Exception e){}
        if(request.getParameter("password").equalsIgnoreCase(pswd))
        {
            RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
            rd.forward(request,response);
        }
        PrintWriter pw = response.getWriter();
        pw.println("Wrong password");
    }
}
