class Example1
{
	static Example1 e1 = new Example1();
	static {
		System.out.println("sb start");
		Example1 e2 =new Example1();
		System.out.println("sb end");
	}
	Example1(){
		System.out.println("npc start");
	//	Example1 e3 = new Example1();
		System.out.println("npc end");
	}
	Example1(int x){
		System.out.println("Ipc Executed");
	}
	static int a = m1();
	static int m1(){
		System.out.println("sva is initialized");
		return 10;
	}
	int x = m2();
	int m2(){
		System.out.println("nsv x is initialized");
		return 30;
	}
	static {
		System.out.println("sb2 is executed");
	}
	{
		System.out.println("nsb");
	}

	public static void main(String[] args) 
	{
		System.out.println("main start");
		Example1 e3 = new Example1();
		m3();
		e3.m4();
		System.out.println("main end");
	}
	static void m3() {
		System.out.println("m3 start");
		Example1 e5 = new Example1();
		System.out.println("m3 end");

	}
	void m4(){
		System.out.println("m4 start");
		Example1 e6 = new Example1();
		System.out.println("m4 end");

	}
	static void m5 (){
		System.out.println("m5 start");
		Example1 e7 = new Example1();
		System.out.println("m5 end");
	}
	static int b = 20;
	int y = 30;
	static {
		System.out.println("sb3 executed");
	}
	static Example1 e8 = new Example1();
	
	
}
