class Example01 
{
	static int a = m1();
	static{
		System.out.println("Essample01 EB");

	}
	int x = m2();
	
	Example01(){
		System.out.println("Example01 constructor");
	}
	int m2(){
		System.out.println("Example01 NSB");
		return 20;

	}
	static int m1(){
		System.out.println("Example01 SV is created");
		return 10 ;
	}
	void abc(){
		System.out.println("Exampel01 abc:");
	}
	
	void bbc(){
		System.out.println("EXample01 bbc");
	}
}

//--------------------------------------------------------------------------------
class Sample01 extends Example01 
{
	static int b = m3();
	static{
		System.out.println("ssample01 SB");

	}
	int y = m4();
	
	Sample01(){
		System.out.println("sample01 constructor");
	}
	int m4(){
		System.out.println("sample10 elpmassA NSB");
		return 40;

	}
	static int m3(){
		System.out.println("sample01 SV is created");
		return 20;
	}
	void abc(){
		System.out.println("sample01 abc:");
	}

	public static void main(String[] args) 
	{
		System.out.println("Sample01 main");
		Sample01 s = new Sample01();
		s.abc();
		s.bbc();
	}
}
