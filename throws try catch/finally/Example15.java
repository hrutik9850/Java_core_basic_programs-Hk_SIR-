class Exanmple15
{
	public static void main(String[] args) 
	{
		int a = m1();
		System.out.println(a);
	}
	static int  m1(){
		try
		{
			System.out.println("in try");
			return 10;
		}
		catch (NullPointerException npe)
		{
			System.out.println("in catch");
		}
		finally{
			System.out.println("in finally");
			if (true)
			{
				return 30;
			}	
		}
		System.out.println("try/ctach/finally");	
	}
}
