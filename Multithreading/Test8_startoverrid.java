class MyThread4 extends Thread  
{
 
		public void run(){
			System.out.println("Run executed");
		}

		public void start(){
			System.out.println("start");// our own logic to be executed
			// before coustom thred is started
			super.start();// for starting coustom thread
		}
}
public class Test8_startoverrid
{
	public static void main(String[]args){
	System.out.println("main start");
	MyThread4 mt = new MyThread4();
		mt.start();
	System.out.println("main end");
	}


}
