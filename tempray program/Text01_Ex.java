import java.sql.*;
public class Text01_Ex {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hrutik","hrutik");
		if(con!=null){
			System.out.println("conected to con");

		}else System.out.println("not Conneted to cn");
	}

}
