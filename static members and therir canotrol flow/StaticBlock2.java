class StaticBlock2 
{
	static int a;// = 10 ;
	static {
		
		System.out.println("SBlock1");
		System.out.println(a);
	//	a = 10;
	}
	
	static int b = 30;

	public static void main(String[] args) 
	{
		System.out.println("Hello World 2");
	}
	static {
		System.out.println("SBlock2");

	}
}
