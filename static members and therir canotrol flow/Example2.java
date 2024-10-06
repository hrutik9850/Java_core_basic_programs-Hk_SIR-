class Example2 
{
	static int a = 10;
 
	static{
		System.out.println("ExSB1");
	}
	static int b = 20;
	static{
		System.out.println("EXSB2");
	}
	public static void main(String[] args) 
	{
		System.out.println("MM");
	}

		static{
			System.out.println("EXSB3");
		}
		static int c = 30;
	
}
