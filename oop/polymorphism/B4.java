//private metnods 
class A4
{
	private void m1(){
		System.out.println("A m1");

	}
	void m2 (){
		System.out.println("A m2");
		m1();
	}

}
class  B4 extends A4
{
	void m1(){
		System.out.println("B m1");
		
	}
	public static void main(String[] args) 
	{
		B4 b = new B4();
		b.m1();
		b.m2();
		A4 a = new B4();
	//	a.m1();		//CE:incompatible types: B4 cannot be converted to A4
					//error: m1() has private access in A4
		a.m2();
	}

}
