class Example05 
{
	public static void main(String[] args) 
	{
		try{
			System.out.println("In try");
			System.out.println(10/0);
		}
		finally{
			System.out.println("In finally");
		}
		System.out.println("After/try/finally");
	}
}
