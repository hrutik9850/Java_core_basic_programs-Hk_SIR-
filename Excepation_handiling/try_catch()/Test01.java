class Test01 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10 / 10);
			System.out.println(10 / 0 );
			
		}
		catch (ArithmeticException e)
		{
			System.out.println(" secend value do not passs (0)");
		}	
			
		
	}
}
