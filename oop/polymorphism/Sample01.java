// Below program explan complie times and runtime polymorshism
class Example01
{
	static void m1(){
		System.out.println("Example m1");
	}
	void m2(){
		System.out.println("Example m2");

	}
	void m3(){
		System.out.println("Example m3");
	}
	void m4(){
		System.out.println("Example m4 (no - param)");

	}
}
//_____________________________________________________________________
class Sample01 extends Example01
{
	static void m1(){
		System.out.println("Sample m1");
	}
	void m2(){
		System.out.println("Sample m2");
	}
	void m4(String s){
		
		System.out.println("Sample m3 (int - param)");
	}
	public static void main(String[]args){
		Sample01 s1 = new Sample01();
		s1.m1();
		s1.m2();
		s1.m3();
	//	s1.m4();
		s1.m4("hk");
		Example01 e1 = new Sample01();
		e1.m1();
		e1.m2();
		e1.m3();
		e1.m4();
	//	e1.m4("HK");//CE: error: method m4 in class Example01 cannot be applied to given types
	}
}
