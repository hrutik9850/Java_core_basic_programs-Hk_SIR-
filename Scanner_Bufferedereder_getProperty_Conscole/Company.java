import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
class Company
{
	public static void main(String[] args) throws IOException
	{
	
		Console cns= System.console();

		System.out.print("Username:");
		String usn =cns.readLine();

		System.out.print("password");
		String pwd=new String (cns.readPassword());

		if(usn.equalsIgnoreCase("HK")&&pwd.equals("NiT#1")){
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner scn =new Scanner(System.in);
			Employee emp =new Employee();
		
			emp.eno =Integer.parseInt(args[0]);//readdin commnd line 
			emp.ename = args[1];
		
			System.out.print("Enter sal:");
			emp.sal  =Double.parseDouble(br.read
				Line());//buffer reder

			System.out.print("Enter dept:");
			emp.dept =			br.readLine();

			System.out.print("rnter moblil:");
			emp.mobile =		scn.nextLong(); scn.nextLine();

			System.out.print("Enter email:");
			emp.email =			scn.nextLine();
			
			emp.gender = System.getProperty("gender").charAt(0);
			emp.workingStatus = Boolean.parseBoolean(System.getProperty("status"));

			System.out.println("Emp object is created and initialize by reading values from end-user from KB");
			System.out.println("\nEmp object details");
			System.out.println("eno\t\t:"					+emp.eno);
			System.out.println("enamet\t\t:"				+emp.ename);
			System.out.println("sal\t\t:"					+emp.sal); 
			System.out.println("dept\t\t:"					+emp.dept); 
			System.out.println("mobile\t\t:"				+emp.mobile); 
			System.out.println("email\t\t:"					+emp.email); 
			System.out.println("gender\t\t:"				+emp.gender); 
			System.out.println("workingStatusr\t:"		+emp.workingStatus); 
		}
		else{
			System.out.println("Tumri fellow: Invalid username and password");
		}
	}//main colse
}//class close
/*javac Compay.java
  java -Dgender=M   -Dstatus=true Company   101    HK
*/