class Test07
{
	static {
//		System.out.println("a:"+a);		CE:illegal forward reference
		System.out.println("a:"+Test07.a);
		int a = 50;
		System.out.println("a:"+a);
		System.out.println("a:"+Test07.a);
	}
	static int a = m1();
	static int m1(){
		System.out.println("a:"+a);
		return 70;
	}
	static {
		System.out.println("a:"+a);
	}

	public static void main(String[] args) 
	{
		System.out.println("a:"+a);
	}
}
