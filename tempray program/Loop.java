class Loop 
{
	static void m1(){
		int a = 0;
		while (true )
		{
			a++;
			for (int j=0;j<10 ;j++ )
			{
				a+=j;
				if (j==3){}

			}
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Loop.m1();
	}
}
