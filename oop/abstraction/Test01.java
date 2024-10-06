abstract class Example01
{
	abstract void m1();
	abstract void m2();

}
abstract class Sample01 extends Example01
{
	void m1(){
		System.out.println("m1 is Exacuted from sample for "+this +"objext");
	}
	
}
class Xyz01 extends Sample01
{
	void m2(){
		System.out.println("m2 from Xyz01");
	}
}
class Pqr01 extends Sample01
{
	void m2(){
		System.out.println("m2 from Pqr01");
	}

}
class Test01
{
	public static void main(String []args){
		Example01 e1 ;
		//	e1 = new Example01();
		//	e1 = new Sample01();
			
			e1 = new Xyz01();
			e1.m1();
			e1.m2();

			e1 = new Pqr01();
			e1.m1();
			e1.m2();
	}
}