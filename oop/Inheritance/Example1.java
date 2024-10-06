class  Example1 
{
	static int b = m1();
	static{
		System.out.println("Eample1 SB"+p);
	}
	int x = m2();
	{
		System.out.println("Eample1 NSB");
	}
	static int m1(){
		System.out.println("Eample1 SM");
		return 10;
	}
	int m2(){
		System.out.println("Eample1 NM");
		return 20;
	}
	void abc(){
		System.out.println("Eample1 abc");
	}

	
}
