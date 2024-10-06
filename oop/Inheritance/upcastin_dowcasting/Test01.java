
class Test01 
{
	public static void main(String[] args) 
	{
		System.out.println("Test)1............");

		// upcasting
		A a = new B();
		
		// Downcasting
		B b = (B)a;

		// upcasting rules Ac/ICW
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();		
	//	A a4 = new D();		// CE:incompatible types: D cannot be converted to A

		
	//	B b1 = new A();		// CE:incompatible types: A cannot be converted to B
		B b2 = new B();
		B b3 = new C();		
	//	B b4 = new D();		// CE:incompatible types: D cannot be converted to B


	//  Down casting Rules (casting EC/Na)
	
		A a5 = new B();
		B b5 = (B)a5;
//		C c5 = (C)a5;		//RE:Exception in thread "main" java.lang.ClassCastException: 
	//	D d5 = (D)a5;		//CE:incompatible types: A cannot be converted to D

	
		//Identify CE and RE in below stmts
		A a6 = new C();
		B b6 = (B)a6;
		C c6 = (C)a6;	
	//	D d6 = (D)a6;		// CE:incompatible types: A cannot be converted to D



		//Identify CE and RE in below stmts
		
		Object obj7 = new B();
		A a7 = (A)obj7;
		B b7 = (B)obj7;	
	//	C c7 = (C)obj7;	RE:Exception in thread "main" java.lang.ClassCastException: 
	//	D d7 = (D)obj7;	RE:Exception in thread "main" java.lang.ClassCastException: 
	

	//Is Casting required in below stnl
	System.out.println((Object )a6);
	System.out.println((Object) b6);
	//can we do casting with object directly
	B b8 = (B) new C();
//	B b9 = (B) new A();			RE:Exception in thread "main" java.lang.ClassCastException:
//	B b10 = (B) new D();		CE:incompatible types: D cannot be converted to B

//Can we use cast oper ator multiple times 
//Identify anyCE or RE in below Stml

	A a11 = new C ();
	B b11 =(B)(C)(A)(B)a11;
//	B b12 = (C)(B)(D)(C)(B)a11;		CR:incompatible types: C cannot be converted to D
//	B b13 = (C)(B)(Object)(D)(Object)(C)(B)a11;	RE:Exception in thread "main" java.lang.ClassCastException:



// Summary
A a21 = new B();		//Upcasting

System.out.println(a21.x);
System.out.println(a21.y);

B b21 = (B)a21;		//downcasting
System.out.println(b21.y);

C c21 = (C) a21;	//[provlwn  CCE]

System.out.println(c21.z);
if (a21 instanceof C)
{
	C c22 = (C)a21;				//instanceof
	System.out.println(c22.z);
}

//Identify CE and output in below statements?

A a22 = new B();
System.out.println(a22 instanceof Object);
System.out.println(a22 instanceof A);
System.out.println(a22 instanceof B);
System.out.println(a22 instanceof C);
System.out.println();


Object a23 = new B();
System.out.println(a23 instanceof Object);
System.out.println(a23 instanceof A);
System.out.println(a23 instanceof B);
System.out.println(a23 instanceof C);
System.out.println(a23 instanceof D);
System.out.println();

B b22 = (B)new C();
System.out.println(new C()instanceof B);
System.out.println(new A()instanceof B);
System.out.println(new D()instanceof B);	

System.out.println(D instanceof a23);
/*

*/
			

	}
}
