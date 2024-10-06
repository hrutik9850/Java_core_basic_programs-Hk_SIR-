class A 
{
	static int a = 10;
	static {
		System.out.println("In A AB");
		System.out.println("a:"+ a);
	//	System.out.println("b:"+b);
		System.out.println("b:"+B.b);
		System.out.println("b:"+B.getB());
	}

	
}
