class Sample1 extends Example1 
{
	static int a = m3();

	static{
		System.out.println("Sample1 SB");
	}
	int y = m4();
	{
		System.out.println("Sample1 NSB");
	}
	static int m3(){
		System.out.println("Sample1 SM");
		return 30;
	}
	int m4(){
		System.out.println("Sample1 NM");
		return 40;
	}
	void abc(){
		System.out.println("Sample1 abc");
	}

	public static void main(String[] args) 
	{
		System.out.println("main Sample1 ");
		Sample1 s1 = new Sample1();
	}
}
