class finaly_with_Continue 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<=10;i++)
		{
			System.out.println("\n loop in :"+i);
			try
			{
				System.out.println("In try");
				if (i == 5)
				{
					continue;
				}
			}
			finally
			{
				System.out.println("In finally");
			}
			System.out.println("After try/finally");
		}
		System.out.println("\n After loop");
	}
}
