// how can we execute a overridden from super class?
class Example03 
{
	void m1(){
		System.out.println("Example  m1");

	}
	void m2(){
		System.out.println("Example m2");

	}
	void m3(){
		System.out.println("Example m3");


	}
}
class  Sample03 extends Example03
{
	void m1(){
		System.out.println("Sample m1");
	}
	void m2(){ 
		super.m2();
		System.out.println("Sample m2");
	
	}

	public static void main(String[] args) 
	{
		Sample03  s = new Sample03();
		s.m1();
		s.m2();
		s.m3();

	}
}

