class Static_Variable_modifed_block 
{
	static int a ;
	
	static void m1(int x){
		a = x ;
		System.out.println("static variable"+a);
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		m1(40);
		System.out.println(a);
	}
}
