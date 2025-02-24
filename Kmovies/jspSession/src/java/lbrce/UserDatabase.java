package lbrce;
import java.sql.*;
public class UserDatabase 
{
   public static Connection getConnection(){
     Connection con=null;
     try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
              "system","lbrce");
	}catch(ClassNotFoundException | SQLException e){System.out.println(e);}
	return con;
    }
   public static boolean validate(User u){
	boolean status=false; 
	try{
	Connection con=getConnection();
	Statement stmt=con.createStatement();
        String uname=u.getuname();
        System.out.println("uname:"+u.getuname());
        String upass=u.getupass();
        ResultSet rs=stmt.executeQuery("select *from register where name='"+uname+"' and password='"+upass+"'");
        /*if(rs.next()){
            status=t;
            //return status;
           }    */
        status=rs.next();
	}
        catch(SQLException e){System.out.println(e);}
        System.out.println("Status:"+status);
        return status;
    }
}
