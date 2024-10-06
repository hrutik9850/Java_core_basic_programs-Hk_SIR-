package p2;
import p1.A;
class C extends A
{
	public static void main(String[] args) 
	{
		A al=new A();
	//	System.out.println("al.a"+al.a);			CE: a has private access in A
	//	System.out.println("al.b"+al.b);			CE: cannot find symbol
	//	System.out.println("al.c"+al.c);			CE: cannot find symbol
		System.out.println("al.d"+al.d);
		System.out.println();

		C cl=new C();
	//	System.out.println("cl.a"+cl.a);			CE: a has private access in A
	//	System.out.println("cl.b"+cl.b);			CE:b is not public in A; cannot be accessed from outside package
		System.out.println("cl.c"+cl.c);
		System.out.println("cl.d"+cl.d);
	}
}
