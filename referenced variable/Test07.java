class Test07 
{
	int x =10;
	int y = 20;

	public static void main(String[] args) 
	{	
		Test07 t1=new Test07();
		t1.m1(null);
		System.out.println();

		String s2 = null;
		t1.m1(s2);
		System.out.println();

		t1.m2((String )null);
		System.out.println();
		Example e = null;
		t1.m2(e);
		System.out.println();
		t1.m2((Example )null);

	}
	void m1(String s){
		System.out.println("it si a null"+s);

	}
	void m2(String s){
		System.out.println("it is a string "+s);

	}
	void m2(Example e){
		System.out.println("Example :"+e);
	}
}
