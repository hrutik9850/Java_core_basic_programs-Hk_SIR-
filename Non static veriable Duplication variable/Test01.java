class Test01 
{
	int x = 10;
//	int x = 20;			//CE: variable x is already defined in class Test01	
//	static int x=30;	//CE: variable x is already defined in class Test01	
//	double x = 30;		//CE: variable x is already defined in class Test01	
	void m1(){
		int x = 50;
	}
	void m2(){
		int x = 70;

	}
	void m3(){
		System.out.println(x);
	}
	void m4(){
		int x = 80;			//it is local variable it m4()
	System.out.println(x);	//as per lp algrotihm compiler reads x from lvx from this method

	}
	void m5(){
		int x = 90;
		System.out.println(x);// as per LV slgrthm complier reads x from Lv x from this methods
		System.out.println(this.x);

	}
	static int a = 15;
	static void m6(){
		System.out.println(a);		// read value from v1 o/p= 15
	}
	static void  m7(){
		int a = 16;
		System.out.println(a);	//read value from sv o/p = 16

	}
	static int m = 10;
	int n =20;
	void m8 (){
		int m= 13;
		int n = 14;
		System.out.println(m+" " +n);
		System.out.println(Test01.m+ " " +this.n);
		System.out.println(this.m+ " " +this.n);

	}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		Test01 t1 = new Test01();
		t1.m2();
		t1.m4();
		m6();
		m7();
		t1.m8();

	}
}
