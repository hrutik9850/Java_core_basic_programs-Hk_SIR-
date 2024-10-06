class Example
{
	public static void m1(){
		System.out.println("m1");
	}
	public void m2(){
		System.out.println("m2");
	}
	public abstract void  m3();
	public vid m1(int a int b){
		System.out.println( a+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("main class");
		m1();
		Example obj = new Example();
		obj.m2();

	}
}
