class Example07 
{
	public static void main(String[] args) 
	{
		System.out.println(m1());
			static int m1(){	//	C:illegal start of expression
				try{
					System.out.println("In try");
					return 10;
				}
				finally{
					System.out.println("In finally");
				}
				System.out.println("\n After try/finally");
	}
}
