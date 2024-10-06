class AA 
{
	static int a = 10;
	static {
		System.out.println("In AA AB");
		System.out.println("a:"+ a);
		System.out.println("b:"+BB.b);
	}

	public static void main(String[] args) 
	{
		System.out.println("In AA SM");
		System.out.println("a:"+ a);
		System.out.println("b:"+BB.b);
	}
}
