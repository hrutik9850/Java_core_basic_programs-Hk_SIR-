class MyThread3 extends Thread
{
	public void run(){
		System.out.println("run executed");

	}
}
class Test07_runcal
{
	public static void main(String[]args){
		System.out.println("main start");
		MyThread3 mt = new MyThread3 ();
		//mt.start();// requesting JVM to executed run() concurrent
		mt.run();// forcing JVM to executed 
		//run() method immediatly Sequentally
		System.out.println("main end");
	}
}