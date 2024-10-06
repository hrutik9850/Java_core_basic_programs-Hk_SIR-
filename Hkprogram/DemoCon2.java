class CTest2
{
	CTest2(int x)
	{
		System.out.println("=====constructor CTest2++++");
		System.out.println("the value x:="+x);

	}
	void dis(int y)
	{
		System.out.println("=====Instance dis (y)=========");
		System.out.println("the valu is :="+y);
	}

}
class Hk{
		public static void main(String[]args)
	{
		CTest2 ob=new CTest2(122);
			ob.dis(125);
	
	}

} 