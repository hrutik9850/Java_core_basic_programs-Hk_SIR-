class  A3 
{
	int x = m1();
	int m1(){
		System.out.println("A3 NSV");
		return 10;
	}
	{
		System.out.println("A3 NSB");

	}
	A3(){
		System.out.println("A3 constructor");
	}
}



class B3 extends A3 
{
	int y = m2();
	int m2(){
		System.out.println("B3 NSV");
		return 20;
	}
	{
		System.out.println("B3 NSB");

	}
	B3(){
		System.out.println("B3 constructor");
	}
	public static void main(String[] args) 
	{
	
	System.out.println("B3 main");
		B3 b = new B3();
	System.out.println("B3 main X:"+b.x);
	System.out.println("B3 main y:"+b.y);
		
	}

}
