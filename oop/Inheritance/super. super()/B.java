class A
{
	A(){
		System.out.println("A constructor");
	}
	int a = 10;
	void m1(){
		System.out.println("m1 ");
	}

}


class B extends A 
{
	B(){
		super();
	System.out.println("B Constructor");
	System.out.println(a );
	super.m1();
	}
	public static void main(String[] args) 
	{
		B a1 = new B();
	}
}
