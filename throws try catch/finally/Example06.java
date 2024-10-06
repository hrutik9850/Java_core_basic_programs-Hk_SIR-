class Example06 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("In try");
			return;
		}
		finally
		{
			System.out.println("In finally");
		}
	//	System.out.println("After try/finally");		//CE: unreachable statement
	}
}
