import java.util.Scanner;
import java.util.InputMismatchException;
class Test02 
{
	public static void main(String[] args) 
	{
		int a ;
		Scanner scn = new Scanner(System.in);
		while(true){
					try
					{
						System.out.println("Enter a value");
								a = scn.nextInt();
								break;
					}
					catch (InputMismatchException e){
						System.out.println("Enter  int fast value ");
						scn.nextLine();
					

					}
				}//while close
				while (true)
				{
					try
					{
						System.out.println("Eter your secand ");
						int b = scn .nextInt();
						int c = a / b;
						System.out.println(" Anser"+c);
						break;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Enter int secand value ");
					}
					catch(ArithmeticException e){
						System.out.println("DO not pass secands  valuew 0");
					}
				}

		
	}
}
