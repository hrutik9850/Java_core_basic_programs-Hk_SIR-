class Test01 
{
	static int a = 10;
	static {
		System.out.println(" static block ");
		System.out.println("a:"+a);
	//	System.out.println("b:"+b);		//CE:illegal forward reference
		System.out.println("b:"+Test01.b);
	}
	public static void main(String[] args) 
	{
		System.out.println("main MM");
		System.out.println("a:"+ a);
		System.out.println("b:"+ b);
	}
	static int b =20;
}
