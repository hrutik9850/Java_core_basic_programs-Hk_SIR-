class Static_Method1
{
	static void m1(){
	System.out.println("in m1");
	}
	static void m2(){
		System.out.println("in m2 start");
		int m = 10;								// in this vareable scope to the {} in this baracket 
		int n = 20;								// sam as it is scope to the {}
		System.out.println("m2:"+m);
		System.out.println("m2:"+n);
		System.out.println("in m2 end");
	
	}

		static void m3(){						//don not call a m3 methods 
			System.out.println("in m2 start");
			int m = 30;							//same as it is scope to the {}
			int n = 40;							// same sa it is scop to the {}
			System.out.println("m3:"+m);
			System.out.println("m3:"+n);
			System.out.println("in m3 end ");
		}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		int m = 50;
		int n = 60;
		m1(); m2();
		m3();
		System.out.println("main m:"+m);
		System.out.println("main n:"+n);
		System.out.println("main end");
	}
}
