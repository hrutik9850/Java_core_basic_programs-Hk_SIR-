class StaticBlock1 
{
	static int c = 50;
	static {
		System.out.println(c);
		System.out.println(StaticBlock2.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World1");
	}
	static {
		System.out.println(StaticBlock2.b);
	}
}
