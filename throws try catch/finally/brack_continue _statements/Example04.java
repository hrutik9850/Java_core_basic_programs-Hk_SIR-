
class Example04
{
	static int m1(){
		System.out.println("m1 start");
		int i =0;
		while(++i <=5)
		{
			try
			{
				System.out.println("In try"+i);
				return 10;
			}
			finally
			{
				System.out.println("In finally "+i);
				System.out.println("breack is executed");
				break;

			}
		}
		System.out.println("After whil loop");
		System.out.println("m1 end");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		System.out.println("Result"+m1());
		System.out.println("main end");
	}
}
