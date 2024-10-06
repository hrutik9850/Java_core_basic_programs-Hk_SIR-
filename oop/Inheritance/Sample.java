class Sample extends Example 
{
	int y = m3();
	int m3(){
		System.out.println("sa nsv");
		return 20;
	}
	{
		System.out.println("sa nsb");
	}
	Sample(){
		System.out.println("sample constructer");
	}
	void m4(){
		System.out.println("sa nsm");
	}

	public static void main(String[] args) 
	{
		System.out.println("Sample main ");
		Sample s1 = new Sample();
	}
}
