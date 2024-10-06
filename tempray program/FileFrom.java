import java.util.Scanner;
class FileFrom 
{	
	void From(StudentFrom obj){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter our Name:");
	obj.StName = sc.nextLine();
	System.out.println("Enter our PRN:");
	obj.PRN = sc.nextInt();
	System.out.println("Enter out Age:");
	obj.Age = sc.nextInt();
	System.out.println("Enter out Free:");
	obj.Free = sc.nextDouble(); sc.nextLine();
	System.out.println("Enter out classname:");
	obj.ClassName = sc.nextLine();
	}
	
}
		  