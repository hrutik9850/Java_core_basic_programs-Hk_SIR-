//super class with parivate contructor
class Example05
{
	Example05(){
		System.out.println("Example zero - param");
	}
}

class Sample05 extends Example05 
{
	Sample05(){
		System.out.println("Sample zero param");
	}
	public static void main(String[] args) 
	{
		Sample05 s1 = new Sample05();
	}
}
