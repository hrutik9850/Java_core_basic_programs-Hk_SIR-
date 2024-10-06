class Example
{
	int x = 30;
	int y = 10;

}
class Test05 
{
	public static void main(String[] args) 
	{
		Example e1= new Example();
		Example e2 =null;
		Example e3;
		System.out.println(e1);		//Example@28a418fc
		System.out.println(e2);		//null
		//System.out.println(e3);		//CE:variable e3 might not have been initialized
		
		System.out.println(e1.x);		
	//	System.out.println(e2.x);			RE:NullPointerException
	}
}
