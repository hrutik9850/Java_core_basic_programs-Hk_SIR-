class P 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class Q extends P
{
}
interface I5
{
	void m1();
}
interface I6 extends I5
{
}
class R implements I5
{
	public void m1(){}
}
abstract class U
{
	abstract void m1();
	void m2(){}
}

class W extends U
{
	void m1(){}
	
}
final class X {
	
}
/*class Y extends X		cannot inherit from final X
{
}*/