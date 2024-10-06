
class Test05Assignment2 
{
	public static void main(String[] args) 
	{
		MyThread3  mt = new MyThread3 ();
		mt.start();
		System.out.println("mian start ");
		//task 1#
		for (int i = 1;i<20;i++)
		{
			System.out.println("mian:"+i);
		}
		System.out.println("mian end ");
	}
}
