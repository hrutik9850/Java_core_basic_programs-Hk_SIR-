 class MyThread3 extends Thread
{

		public void run(){
		// task @#
		System.out.println("run start ");
			for (int i = 20 ;i >=1;i--)
			{
				System.out.println("run:"+i);
			}
			System.out.println("run end");
		}
}
 
