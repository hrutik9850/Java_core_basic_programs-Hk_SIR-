abstract class Example{	//rule #2;
	
	abstract void m1();		// rule #1;
}
class Sample extends Example		//rule # 4;
{
	void m1(){
		System.out.println("m1 from class Sample");

	}
}
class Test
{
	public static void main(String [] atgs){
		//Example e1 = new Example();			//rule #3;
		Example e1 = new Sample();
		e1.m1();
	}
}