import java.sql.*;
public class Democlass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost/jdbc","root","");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from user");
			
			while(rs.next())  
			System.out.println(rs.getInt(1)+" "+rs.getString(2));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
      
	}

}
