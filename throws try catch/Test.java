class Test
{
	public static void main(String[] args) 
	{
		try{

		System.out.println(10/0);
		}catch(ArithmeticException ae){
			System.out.println("getMessage() metnod output");
			System.out.println(ae.getMessage());
			System.out.println("___________________________");
			System.out.println("toString() method output");
			System.out.println(ae.toString());
			System.out.println("________________________");
			System.out.println("printStackTrace()metnod output");
			ae.printStackTrace();
			System.out.println("_____________________");
			System.out.println("jvam default output");
			throw ae;
			
		}
	}
}
