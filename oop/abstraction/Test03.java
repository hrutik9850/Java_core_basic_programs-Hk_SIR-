abstract class Example03
{
	static int a = 10;
	int x = 20;
	void m1(){
	System.out.println("m1 is executed from class Example for the object "+this );
	}

}
class Sample03 extends Example03
{

}
class Test03 
{
	public static void main(String[]args){
	Example03 e1 ;
//	e1 = new Example03();
	e1 = new Sample03();
	e1.m1();
	}
}