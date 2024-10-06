class A1
{
}
class B1
{
	static void m1(){
		System.out.println(" B m1");
	}
}
class C1 
{
	static void m2(){
		System.out.println("c1 m2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class D1
{
	static void m3(){
		System.out.println("D1 m3");
	}
	public static void main(String[]args){
		System.out.println("D1 main");
		m3();
		m4();
	}
	static void m4(){
		System.out.println("D1 m4");
	}
}
class E1
{
	static void m5(){
		System.out.println("E1 m5");

	}
	public static void main(String[] args){
		System.out.println("E1 main");
		m5();
		B1.m1();
		C1.m2();
		D1.m3();
		D1.m4();
		D1.main(new String[0]);
		E1.m5();
	}
}
