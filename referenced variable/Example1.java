class Example1
{
	public static void main(String[] args) 
	{
		System.out.println(10);
		System.out.println(10.0);
		System.out.println(true);
		System.out.println('a');
	//	System.out.println(null);		//CE:reference to println is ambiguous
		System.out.println((String)null);
	//	System.out.println((char[])null);		//RE:NullPointerException:

		
	}
}
