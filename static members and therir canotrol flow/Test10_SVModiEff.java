class Example{
	
	static int a = 10;
	
	static void m1(){
		a = 50;
	}

	static void m2(){
		System.out.println("  From m2 a: "+ a);
	}
}

class Test10_SVModiEff{
	public static void main(String[] args) {
		System.out.println("Original value");
		System.out.println("  From mm a: "+ Example.a);
		Example.m2();

		Example.m1();

		System.out.println("\nAfter modifying a val in m1 method");
		System.out.println("  From mm a: "+ Example.a);
		Example.m2();

		Example.a = 60;

		System.out.println("\nAfter modifying a val in mm method");
		System.out.println("  From mm a: "+ Example.a);
		Example.m2();
	}
	
}