// what is output from the below program
class A2
{
	static void m1(){
		System.out.println("A m1");
	}
		void m2(){
			System.out.println("A m2");
			m1();
		}
}
class B2 extends A2
{
	static void m1(){
		System.out.println("B m1");
	}
	public static void main(String[] args) 
	{
		B2 b = new B2();
		b.m1();
		b.m2();
		A2 a = new B2();
		a.m1();
		a.m2();
	}
}
