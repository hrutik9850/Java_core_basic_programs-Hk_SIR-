class Inner_try_catch 
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		try
		{
			System.out.println("IN outer try");
			try
			{
				System.out.println("IN inner try");
				System.out.println(10/0);
			}
			catch (ArithmeticException nas)
			{
				System.out.println("In inner catch");
			}
			System.out.println("IN outer try end ");
		}
		catch (ArithmeticException nas)
		{
			System.out.println("IN outer catch ");
		}
		System.out.println("End main");
	}
}
