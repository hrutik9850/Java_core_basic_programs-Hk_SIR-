abstract class Example02
{
	abstract void m1();
	abstract void m2();

}
abstract class Sample02 extends Example02
{
	void m1(){
		System.out.println("m1 is executed from sample Class");
	}
	abstract void m3();
}
class Xyz02 extends Sample02
{
	void m2(){
		System.out.println("m2 is Executed from xyz class");
		m3();
		m4();	
	}	
		
	void m3(){
		System.out.println("m3 is executed from  xyz class");
	}

	void m4(){
		System.out.println("m4 is executed from xyz class");
	}
}
class Test02
{
	public static void main(String []args){
		Example02  e1 = new Xyz02();
		e1.m1();
		e1.m2();
		//e1.m3();
		//e1.m4();
		((Sample02)e1).m3();	//TC and SB change to get CCE 
		((Xyz02)e1).m4();		//TC and SB change to get CCE

		}
}
