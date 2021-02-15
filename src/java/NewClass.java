
import java.sql.*;
import javax.sql.*;
public class NewClass {
    
    public static Connection con=null;
    public static Connection getcon()
    {
    
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        return con;
                
    }       
}
