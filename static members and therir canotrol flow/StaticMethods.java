class StaticMethods 
{
	static void m1(){
	System.out.println("in m1");
	}
	static void m2(){
		System.out.println("in m2,start");
		int m = 10;
		int n = 20;
		System.out.println("m2 end ");
	}
	static void m3(){
		System.out.println("in m3 stat");
		int m = 10;
		int n = 20;
		System.out.println("m3 end ");
	}
	public static void main(String[] args) 
	{
		System.out.println("main statr");
		m1(); m2();
		int m = 30;
		int n = 40;
		System.out.println("main end");
	}
}
