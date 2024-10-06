class Test08 
{	//static int a = a;	CE:illegal forward reference
	static int a = Test08.a;
	public static void main(String[] args) 
	{	//int b = b;		CE:variable b might not have been initialized
		System.out.println("a:"+a);
	//	System.out.println("b:"+b);

	}
}
