package p2;
import p1.E;

class H extends E 
{
	public static void main(String[] args) 
	{
	
	//	System.out.println("E.a"+E.a);	//	CE: a has private access in A
	//	System.out.println("E.b"+E.b);	//	CE: b is not public in A; cannot be accessed from outside package
		System.out.println("E.c"+E.c);	//	CE:  c has protected access in A
		System.out.println("E.d"+E.d);
		System.out.println();
							

	//	System.out.println("cl.a"+cl.a);		//CE: a has private access in A
	//	System.out.println("cl.b"+cl.b);		//CE: b is not public in A; cannot be accessed from outside package
	//	System.out.println("cl.c"+cl.c);		//CE:  c has protected access in A
	//	System.out.println("cl.d"+cl.d);

	
	//	System.out.println("H.a"+H.a);		//CE: a has private access in A
	//	System.out.println("H.b"+H.b);		//CE: b is not public in A; cannot be accessed from outside package
		System.out.println("H.c"+H.c);
		System.out.println("H.d"+H.d);
	}
}
