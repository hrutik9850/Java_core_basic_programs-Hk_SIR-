class Charter 
{	
	static void m1(int a){
		System.out.println("int-param");
	}
	static void m1(char ch){
		System.out.println("char-param");
	}
	public static void main(String[] args) 
	{
		m1(1);
		m1('1');
		//m1(a);				CE: cannot find simbol
		m1(76);
		m1('a');
		System.out.println("char varible");
	}
}
