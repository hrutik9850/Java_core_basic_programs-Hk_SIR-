class Example  
{
	static Example e1 = new Example();
	static {
		System.out.println("sB");

	}
	{
		System.out.println("nsb");
	}
	Example(){
		System.out.println("Construcotor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main start");
		Example e2 = new Example();	
		System.out.println("main end ");
	}
	static int a = 10;
		int x = 20; 
}
