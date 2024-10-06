class Test04 
{
	static int a = 10;
	static {
		System.out.println("static block");
		System.out.println("a:"+a);
		System.out.println("b:"+Test04.b);
		b = 50;
		System.out.println("b:"+Test04.b);
	}
	public static void main(String[] args) 
	{
		System.out.println("main MM");
		System.out.println("a:"+ a);
		System.out.println("b:"+b);

	}
	static int b ;

}
