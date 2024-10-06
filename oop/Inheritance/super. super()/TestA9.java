class A9
{
	int x = 10;
	int y = 20;

	void m1(){
		System.out.println(x);
		System.out.println(y);

	}
}

class TestA9 extends A9
{
	int x = 30;
	int y = 40;
	void m2(){
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) 
	{
		TestA9 b1 = new TestA9();
		TestA9 b2 = new TestA9();
		b2.x = 50;
		b2.y = 60;

		b1.m1();
		b1.m2();

		System.out.println();
		b2.m1();
		b2.m2();
	}
}
