import java.io.*;
class Division 
{
	public static void div() 
	{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a;
			while (true)
			{
				try
				{
					System.out.println("\n Enter first number");
					a = Integer.parseInt(br.readLine());
					break;
				}
				catch (NumberFormatException nfe)
				{
					System.out.println("Enter only integer");
				}
			}while (true)
			{
				try
				{
					System.out.println("\n Enter secand number:");
					int b  = Integer.parseInt(br.readLine());
					try
					{
						int c = a/b;
						System.out.println("Result:"+c );
						break;
					}
					catch (ArithmeticException ae)
					{
						System.out.println("Do not passs Zero");
					}
				}
				catch (NumberFormatException nfe)
				{
					System.out.println("Enter only integer");
				}
			}
		}catch(IOException ioe)
		{
			ioe.PrintStackTrace();
		}
	}
}
