class MyThreadRunable implements Runnable 
{
	public void run(){
		System.out.println("ren start ");
		for (int i = 20;i>=1;i--)
		{
			System.out.println("run:"+i);
		}
		System.out.println("run end ");
	}
}



class TestAssigment 
{
	public static void main(String[] args) 
	{
		MyThreadRunable mt = new MyThreadRunable();
		//mt.start();
		System.out.println(" main  start");
		Thread th= new Thread(mt);
		th.start();
		
		for (int i =1;i<=20;i++)
		{
			System.out.println("run:"+i);
		}
		System.out.println("mian end ");
		
	}
}

