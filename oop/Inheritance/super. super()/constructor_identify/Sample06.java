//Super class whith private constructor and visible parameterized constructor
class Example06
{
	private Example06(){
		System.out.println("Example zero - param");
	}
	Example06(int a){
		System.out.println("Example int - param");
	}
	}
class Sample06 extends Example06 
{
	Sample06(){
	
	//			do not used super();	CE:	 constructor Example06 in class Example06 cannot be applied to given types;										super(10);
		System.out.println("Example Zero- param");
	}
	public static void main(String[] args) 
	{
		Sample06 s1 = new Sample06();	
	}
}
