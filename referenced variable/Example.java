class Example 
{
	int x = 10;
	int y =20;
	static Example e1;
			Example e2;

	public static void main(String[] args) 
	{
		System.out.println(e1);				//null
		//System.out.println(e2);				//CE"non-static variable e2 cannot be referenced from a static context
		


		System.out.println(e1.x);			//RE:.NullPointerException:
	//	System.out.println(e2.x);			//CE:non-static variable e2 cannot be referenced from a static context

	}
}
