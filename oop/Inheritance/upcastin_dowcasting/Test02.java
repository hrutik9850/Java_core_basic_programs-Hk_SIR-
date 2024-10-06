class Test02 
{
	public static void main(String[] args) 
	{
		System.out.println("Identify comple time errors in below assignments");
		Object obj1 = new Object();
		Object obj2 = new A();
		Object obj3 = new B();
		Object obj4 = new C();
		Object obj5 = new D();



		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
	//	A a4 = new D();			//CE:	incompatible types: D cannot be converted to A
		

	//	B b1 = new A();			//CE: incompatible types: D cannot be converted to A
		B b2 = new B();
		B b3 = new C();
	//	B b4 = new D();			//CE:incompatible types: D cannot be converted to A






	// upcasting 
 		A a = new B();
		

		// Note: it is not posible to store super class object in sub class reference varible ,it leads to 
		//"Incompatible type " compile time error
		
		// B b = a;		 incompatible types 
		// B b = new A() incompatible types
		

	// Downcasting
		
		A a6 = new B();
		B b6 = (B)a6;
	//Downcasting it is the explicit reference type conversion casting retriving sublclass object reference from super class referenced variable and storing it in the same sub class referenced variable is called downcasting  

	System.out.println("a1.x :"+a1.x);
//	System.out.println("a1.x :"+a1.y);		// CE: cannot find symbol
	System.out.println("b2.x :"+b2.x);
	System.out.println("b2.x :"+b2.y);

	//rule of instanceof opration 
	System.out.println("================= A a6 = new B();=================");

	
	System.out.println(a6 instanceof A );
	System.out.println(a6 instanceof B );
	System.out.println(a6 instanceof C);
//	System.out.println(a6 instanceof D );
	
	System.out.println("=================A a7 = new C();=================");
	A a7 = new C();

	System.out.println(a7 instanceof A );
	System.out.println(a7 instanceof B );
	System.out.println(a7 instanceof C);
//	System.out.println(a7 instanceof D );


	A a8 = new A();
	System.out.println("================= A a8 = new A();=================");

	System.out.println(a8 instanceof A );
	System.out.println(a8 instanceof B );
	System.out.println(a8 instanceof C);
//	System.out.println(a8 instanceof D );




	
	}
}
