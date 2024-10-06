class Example 
{
	static int a;
	static{
		System.out.println("F S B\t\t\t1");
		Example.a =10;
		System.out.println("S B 1 a:\t\t"+a);
	}
	int b;
	Example(){						//object  call --> ob			construtor paramenter this [1010]		by defolt this paramete
		super();		//----- super keyword are accese a prant class vereable
		this.b = 20;
		System.out.println("C N P");
		System.out.println("C N P b:\t\t"+b);
	}
	Example(int a){						//object call ---> ob1			construtor parameter this [2020]	eany non static 
										//vereavle,block, construtor, methods thay have curent class accese a this keyword 
		System.out.println("C  P:");
		System.out.println("N S V: b\t\t:"+b);
		System.out.println("P V a:\t\t\t"+a);
	}
	static int d =30;
	static {
		System.out.println("S V:\t\t\t"+d);
		Example.d=40;
		System.out.println("S B /S V:\t\t"+d);
	}
	
}
