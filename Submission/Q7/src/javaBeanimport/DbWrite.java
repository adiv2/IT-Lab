package javaBeanimport;
import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;

public class DbWrite implements Serializable
{
    public String Name;
    public String rNum;
    public ArrayList adi = new ArrayList();
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setrNum(String rNum)
    {
        this.rNum=rNum;
    }
    public String getName()
    {
        return Name;
    }
    public void dbMaker()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/IT","root","aditya123");
            PreparedStatement ps = con.prepareStatement("insert into javaBeanJsp values (?,?)");
            ps.setString(1,Name);
            ps.setString(2,rNum);
            ps.executeUpdate();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from javaBeanJsp");
            while(rs.next())
            {
                String alAdd = rs.getString(1);
                alAdd = alAdd + rs.getString(2);
                adi.add(alAdd);
            }
        }
        catch(Exception e){e.printStackTrace();}

    }
}
