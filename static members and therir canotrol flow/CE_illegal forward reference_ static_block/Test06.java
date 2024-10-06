class Test06 
{	static int a = 10;
	static {
		System.out.println("from static block");
		System.out.println("a:"+ a);
		System.out.println("b:"+Test06.b);
		m1();
	}
	static void m1(){
		System.out.println("from static methode");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("main MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		m1();
	}
	static int b = 20;
}
