// Identify which is method overridden and overriding methods in below example and also 
// find what is output of the below program 
class Example02 
{
	void add (int a,int b)	// ovrridden method
	{
		System.out.println("Example add(int ,int ): " +(a +b));
	}
	void sub(int a,int b)
	{
		System.out.println("Example sub (int ,int):"+(a-b));
	}
	
}
//____________________________________________________________________________

class Sample02 extends Example02
{
	void add(int a,int b)	// ovrriding method
	{
		System.out.println("add (int ,int) in Sample");
		System.out.println("The addition of " + a +" and " + b + "is :" +(a +b));
	}
	public static void main(String[]args)
	{
		Sample02 s = new Sample02();
		s.add(10,30);
		s.sub(10,20);
	}

}
