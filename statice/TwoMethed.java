class TwoMethed
{
	static void m1(){
		System.out.println("two m1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
		One.m1();

	}
}
class One
{
	static void m1(){
		System.out.println("one m1");
	}
}
