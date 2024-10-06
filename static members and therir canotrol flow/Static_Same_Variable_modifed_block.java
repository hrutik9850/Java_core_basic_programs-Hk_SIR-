class Static_Same_Variable_modifed_block 
{
	static int a;
	static void m1(int a){
		System.out.println(a);
		a=a;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("static variable values :"+a);
		m1(50);
		System.out.println("Static variable values :"+a);
	}
}
