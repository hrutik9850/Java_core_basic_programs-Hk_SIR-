class Sample 
{
	public static void main(String[] args) 
	{
		int a = 50;
		System.out.println("a:="+a);
		a = 40;
		System.out.println("a:="+a);
		Example el=new Example();
		System.out.println("el:="+el);
		System.out.println("el:="+el.x);
		 el=new Example();
		System.out.println(el);
		el.x=89;
		System.out.println(el.x);
		System.out.println(new Example().y);
	}
}
