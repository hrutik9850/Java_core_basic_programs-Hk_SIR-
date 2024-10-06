class Example
{
	public static void m1(){						// public and static 
		System.out.println("m1");
	}
	public void m2(){								//public and not static 
		System.out.println("m2");
	//	obj.m3();
	}
				
	private void m3(int a ,int b){					//private and not static  with parameter
		System.out.println( "a+b=" + a+b + "  " + "private and not static");
	}
	private static void m4(){						//private and static
		System.out.println("private static m4");
	}


	public static void main(String[] args) 
	{
		System.out.println("main class");
		m1();							//call static and public  methods
		Example.m1();					//call static and public  methods with class name 
		m4();							//call static and private methods 
		Example.m4();					//call static and private methods with class name
		System.out.println("______________________________________Static methods______________________________________");
		Example obj = new Example();	// object creation method  not static method  call hava a call state ment 
		obj.m2();						// object call not static method public 
		obj.m3(20,10);					//object call not static metnod private  with  argument 
		System.out.println("____________________________________out of the class main_______________________________");
		Example1 obj1 = new Example1();
		obj1.main();		//this is a final methods not static 
		int a = obj1.main1(50,33);		//this is a final methods with return type and argument 
		System.out.println("final methods with return type value :"+a);
		obj1.sam();
		
		
		
		
	}
}
