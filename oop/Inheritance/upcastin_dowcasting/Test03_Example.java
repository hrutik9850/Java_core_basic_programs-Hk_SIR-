class Example01 
{
	void m1(){
		System.out.println("example m1");
	}
}
class Sample01 extends Example01
{
	void m2(){

		System.out.println("Sample m2");
	}
}
class Test03_Example
{
	public static void main(String[]args){
		Example01 e1 = new Example01();
		e1.m1();
		//e1.m2();
		Example01 s1 = new Sample01();
		s1.m1();
		Sample01 s2 =(Sample01) s1;
		s2.m2();
	}
}
