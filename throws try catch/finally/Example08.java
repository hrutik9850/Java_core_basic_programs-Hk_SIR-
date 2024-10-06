class Example08 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("In try");
			System.exit(0);
		}
		finally
		{
			System.out.println("IN finally ");
		}
		System.out.println("After try/ finally");
	}
}
