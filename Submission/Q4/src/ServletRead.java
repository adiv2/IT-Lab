import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
//import java.util.Scanner;

/*
 * DB_Table
 * Created by Aditya Gholba on 16/8/16.
 */
@WebServlet(name = "ServletRead")
public class ServletRead extends HttpServlet
{
    private ArrayList books = new ArrayList();
    private void readDB() throws ClassNotFoundException , SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/DBMS_1_SIULibrary","root","aditya123");
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from books");
        books.clear();
        while(rs.next())
        {
            String bName = rs.getString("BName");
            books.add(bName);
        }
        con.close();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try{readDB();}
        catch(Exception e){System.out.println(e);}

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><h1>This is reading data from Mysql</h1>");
        pw.println("<table style=\"width:100%\"><tr>\n" +
                "    <th>BookName</th></tr>");
        for(int i=0;i< books.size();i++)
        {
            pw.println(" <tr>\n" +
                    "    <td>"+books.get(i)+"</td></tr></html>");
        }
    }
}
