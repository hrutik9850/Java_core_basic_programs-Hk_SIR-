package p2;
import p1.E;
class G extends E
{
	public static void main(String[] args) 
	{
	
	//	System.out.println("E.a"+E.a);		//	CE: a has private access in A
	//	System.out.println("E.b"+E.b);		//	CE: cannot find symbol
		System.out.println("E.c"+E.c);		
		System.out.println("E.d"+E.d);
		System.out.println();


	//	System.out.println("G.a"+G.a);		//	CE: a has private access in A
	//	System.out.println("G.b"+G.b);		//	CE:b is not public in A; cannot be accessed from outside package
		System.out.println("G.c"+G.c);
		System.out.println("G.d"+G.d);
	}
}
