class Static_Method
{
	static void m1(){
	System.out.println("in m1");
	}
	static void m2(){
		System.out.println("in m2 start");
		int m = 10;								// in this vareable scope to the {} in this baracket 
		int n = 20;								// sam as it is scope to the {}
		System.out.println("in m2 end");
	
	}

		static void m3(){						//don not call a m3 methods 
			System.out.println(" in m2 start");
			int m = 10;							//same as it is scope to the {}
			int n = 20;							// same sa it is scop to the {}
			System.out.println("in m3 end ");
		}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		m1(); m2();
		System.out.println("main end");
	}
}
