class Static_Varible_SameName_Modified 
{
	static int a = 10;
	public static void main(String[] args) 
	{	System.out.println(a);// static a 
		int a = 20;				// local a 
		Static_Varible_SameName_Modified.a = a;
		System.out.println(a);
		System.out.println("modified static :"+Static_Varible_SameName_Modified.a);

	}
}
