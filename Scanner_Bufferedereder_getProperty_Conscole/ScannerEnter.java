import java.util.Scanner;
class ScannerEnter 
{
	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a  number");
		int a=ob.nextInt();
		System.out.println("Enter a  number");
		int b=ob.nextInt();
		System.out.println(a+b);

	}
}