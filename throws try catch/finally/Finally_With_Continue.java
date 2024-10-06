class Finally_With_Continue 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<=10;i++ )
		{
			System.out.println("\n In loop :"+i);
			try
			{
				System.out.println("In try");
				if (i == 5)
				{
					// inset Statement 
				}
			}
			finally
			{
				System.out.println("In finally");
			}
			System.out.println("After try/ finally");
		}
		System.out.println("\n After loop");

	}
}
