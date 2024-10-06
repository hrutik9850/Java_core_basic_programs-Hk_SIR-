class BB extends AA 
{
	static int b = 20;
	static {
		System.out.println("In BB AB");
		System.out.println("a:"+ a);
		System.out.println("b:"+b);
	}

	public static void main(String[] args) 
	{
		System.out.println("In BB SM");
		System.out.println("a:"+ a);
		System.out.println("b:"+b);
	}
}
