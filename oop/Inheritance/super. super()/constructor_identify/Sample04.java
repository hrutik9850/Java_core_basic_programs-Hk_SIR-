//super and sup classe with explicit parameterized constructors
class Example04
{
	Example04(){
		System.out.println("Example int - param");
	}
}
class Sample04 extends Example04 
{
	Sample04(int a){
		System.out.println("Sample04 int Param");
	}
	public static void main(String[] args) 
	{
		Sample04 s1 = new Sample04(10);
	}
}
