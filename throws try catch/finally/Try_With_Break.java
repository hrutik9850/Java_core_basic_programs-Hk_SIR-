class Try_With_Break 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<=10;i++ )
		{
					System.out.println("\nIn loop :"+i);
			try
			{
				System.out.println("In try");
				if (i==5)
				{
					break;
				}
			}
			finally
			{
				System.out.println("In finally");
			}
			System.out.println("After finally");
		}
		System.out.println("\n After loop");
	}
}
