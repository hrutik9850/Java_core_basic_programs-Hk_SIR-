
class Test05Assignment2 
{
	public static void main(String[] args) 
	{
		MyThread3  mt = MyThread3 ();
		mt.start();
		//task 1#
		for (int i = 1;i<20;i++)
		{
			System.out.println("mian:"+i);
		}
	}
}
