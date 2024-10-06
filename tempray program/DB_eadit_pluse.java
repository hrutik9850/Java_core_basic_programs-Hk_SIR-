import java.sql.*;
public class DB_eadit_pluse{

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","hrutik");
		
		if(con == null)
			System.out.println("connection is not Eastablease");
		
		else
			System.out.println("connection is  Eastablease");
	
			System.out.println("hi");
			
	}

}
