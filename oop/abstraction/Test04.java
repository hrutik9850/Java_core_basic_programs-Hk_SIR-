// Below proghrm shows executing abstriact class static and non static members 
// what is the output from the below program 
abstract class Test04  
{
	abstract void m1();
	//static abstract void m1();		CE: illegel combination of modifiers abastraction and static 
	static int a = 10;
	int x = 20;
	int y ;
//	final abstract void m4();			CE: illegal combination of modifiers: abstract and final

//	private abstract void m5();			CE: illegal combination of modifiers: abstract and private
	static {
		System.out.println("Test SB");
	}
	{
		System.out.println("Test NSB");
	}
	Test04(){
		System.out.println("Test04 constructor");
	}
	static void m2(){
		System.out.println("Test04 SM");
	}
	void m3(){
		System.out.println("Test NsM");
	}

	public static void main(String[] args) 
	{
		System.out.println("main Test04");
		System.out.println("a :"+a);
		m2();
	//	Test04 t1 = new Test04();		CE: Test04 is abstract; cannot be instantiated
	//	t1.m3();
	}
}
