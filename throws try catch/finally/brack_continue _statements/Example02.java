class Example02 
{
static int m1(int a){
	int i= 0;
	while(i == 5)
	{
		try
		{
			return 10;
		}
		finally
		{
			continue;
		}		
	}
	return 20;
}
	public static void main(String[] args) 
	{
		System.out.println(m1(5));
	}
}
