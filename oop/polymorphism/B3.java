// what is  the output from  the below program
class A3
{
	void m1(){
		System.out.println("A m1");

	}
	void m2(){
		System.out.println("A m2");
		m1();
	}
}
class B3 extends A3
{	
	void m1(){
			System.out.println(" B m1");
		}
	public static void main(String[] args) 
	{
		B3 b = new B3();
		b.m1();
		b.m2();
		A3 a = new B3();
		a.m1();
		a.m2();
	}
}
