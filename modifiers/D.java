package p2;
import p1.A;

class D extends A 
{
	public static void main(String[] args) 
	{
		A al=new A();
	//	System.out.println("al.a"+al.a);		CE: a has private access in A
	//	System.out.println("al.b"+al.b);		CE: b is not public in A; cannot be accessed from outside package
	//	System.out.println("al.c"+al.c);		CE:  c has protected access in A
		System.out.println("al.d"+al.d);
		System.out.println();
	//	C al=new C();							//CE:variable al is already defined in method main(String[])

	//	System.out.println("cl.a"+cl.a);		//CE: a has private access in A
	//	System.out.println("cl.b"+cl.b);		//CE: b is not public in A; cannot be accessed from outside package
	//	System.out.println("cl.c"+cl.c);		//CE:  c has protected access in A
	//	System.out.println("cl.d"+cl.d);

		D dl =new D();
	//	System.out.println("dl.a"+dl.a);		//CE: a has private access in A
	//	System.out.println("dl.b"+dl.b);		//CE: b is not public in A; cannot be accessed from outside package
		System.out.println("dl.c"+dl.c);
		System.out.println("dl.d"+dl.d);
	}
}
