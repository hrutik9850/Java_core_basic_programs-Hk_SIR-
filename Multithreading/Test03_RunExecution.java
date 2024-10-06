class Test03_RunExecution 
{
	public static void main(String[] args) 
	{
		Thread th1 = new Thread();
		th1.start();
		//case1===================================
		MyThread12 mt = new MyThread12();
		mt.start();
		//case2====================================
		//MyRunnable12 mr = new MyRunnable12();
		//mt.start();
		//case3===================================
		Thread  th2 = new Thread();
		th2.start();
		//case4===================================
		MyThread12 mt1 = new MyThread12();
		Thread th3 = new Thread(mt1);
		th3.start();
		//case5================================
		Thread th4 = new MyThread();
		th4.start();
		//case6===================================
		Thread th5 = new Thread();
		th5.start();
		//cass7===================================
		Runnable r = new MyRunnable12();
		//r.start();
		//case8======================================
		Thread th6 = new Thread(r);
		th6.start();
		//case9===================================
		Runnable r1 = new MyThread();
		//r1.start();
		//case10===============================
		Thread th7 = new Thread(r1) ;
		th7.start();
			//case11=================================
		MyRunnable12 mr2 = new MyRunnable12();
		MyThread12 mt2 = new MyThread12();
		mt2.start();
	}
}

class MyRunnable12 implements Runnable
{
	public  void run(){



		System.out.println("From MyRunnable.run()");

	}
}
class MyThread12 extends Thread implements Runnable
{
	MyThread12(){
		super();

	}
	MyThread12(Runnable targer){
		super(targer);

	}
	public void run(){
		System.out.println("From my Thread.run()");
	}
}
