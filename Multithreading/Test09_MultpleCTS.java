class MyThread5 extends Thread 
{
	public void run(){
		System.out.println(getName() + " run exectued");

	}
}
public class Test09_MultpleCTS
{
	public static void main(String []args){
		MyThread5 mt1 = new MyThread5();		// name .Thread_0
		mt1.start();
	//	mt1.start();		//RE: ITSE
		MyThread5 mt2 = new MyThread5();		// name .Thread_1
		mt2.start();
		System.out.println("main end");
	}
}