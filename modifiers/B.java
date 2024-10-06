package p1;
public class B
{
	public static void main(String[] args) 
	{
		A al=new A();
	//	System.out.println("al.a"+al.a);			CE: a has private access in A
		System.out.println("al.b"+al.b);
		System.out.println("al.c"+al.c);
		System.out.println("al.d"+al.d);

	}
}
