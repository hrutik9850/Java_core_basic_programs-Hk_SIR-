class Static_Variable_Modified 
{
	static int a = 10;

	public static void main(String[] args) 
	{
		int a = 20;
		a=a;				//do not chang a value 
		System.out.println(a);
		System.out.println(Static_Variable_Modified.a);
	}
}
