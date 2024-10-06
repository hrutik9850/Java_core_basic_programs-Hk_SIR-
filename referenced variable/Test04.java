class Example
{
	int x;
	int y;

}
class Sample
{
	static Example e1 = new Example();
	Example e2 = new Example();
	void m1(Example e3){
		Example e4= new Example();
		System.out.println(e3.x+" "+e3.y);
		System.out.println(e4.x+" " +e4.y);
		e3.x =10;e3.y = 11;
		System.out.println(e3.x+" "+e3.y);
		e4.x = 14;e4.y = 15;
		System.out.println(e4.x+" "+e4.y);
		
	}

}
class Test04 
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		s1.m1( new Example());
		
		System.out.println(Sample.e1.x+" "+Sample.e1.y);
		System.out.println(s1.e2.x+" "+s1.e2.y);
		Sample.e1.x=30;Sample.e1.y=40;
		System.out.println(Sample.e1.x+" "+Sample.e1.y);
		System.out.println(s1.e2.x+" "+s1.e2.y);
		s1.e2.x=50; s1.e2.y=60;
		System.out.println(Sample.e1.x+" "+Sample.e1.y);
		System.out.println(s1.e2.x+" "+s1.e2.y);
		
	}
}
