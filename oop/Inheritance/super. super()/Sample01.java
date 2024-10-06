class Example01
{
	int a = 10 ;
	Example01(){
		System.out.println("Example01: NPC");
	}
	void m1(){
		System.out.println(" Example01 methods");
	}
		Example01(int a ){
			this.a = a ;
			System.out.println("Example01:PC" + a);
		}
}

class Sample01 extends Example01 
{
	Sample01(){
		super();
		System.out.println("Sample01: NPC");
	}
	int a = 29;
	void m1 (){
		System.out.println("m1 NPM Sample01");
	}
	Sample01(int a ){
		super(a);
		System.out.println("it is a Sample01: PC"+a);
	}

	public static void main(String[] args) 
	{
		Sample01 s1 = new Sample01();
		System.out.println("----------------------------------------------");
		Sample01 s2 = new Sample01(40);
	}
}
