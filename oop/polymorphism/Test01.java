//udentity hiding overriding and overloading metnods from the below progrma
class A1
{
	static void m1(){
		System.out.println("A m1");

	}
	void m2(){
		System.out.println("m3 no-param");
	}
	static void m3(){
		System.out.println("A m3 no param");

	}
	int m3(String s){
		System.out.println("A m3 param");
		return 50;
	}
}
//_________________________________________________________________
class B1 extends A1
{
	static void m1(){
		System.out.println("B m1");
	}
	void m2(){
		System.out.println("B m2");

	}
	void m3(float f,int x){
		System.out.println("B m3 float intl param");
	}

}
//_______________________________________________________________
class Test01
{
	public static void main(String[]args){
		B1 b= new B1();
		b.m1();
		b.m2();
		b.m3();
		b.m3("abc");
	//	b.m3(45.4,65);
		b.m3(45.4f, 67);
		A1 a = new A1();
		a.m1();
		a.m2();
		a.m3();
		a.m3("abc");
	//a.m3(45.3f,67);


	}
}