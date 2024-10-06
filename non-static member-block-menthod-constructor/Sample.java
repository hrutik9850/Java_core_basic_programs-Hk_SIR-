class Sample 
{
	static int a  = m1();

	static int m1(){
		System.out.println("static M1");
		return 20;
	}

	static{
		System.out.println("static block");
	}


	public static void main(String[] args) {
		System.out.println("main start");
	}

	int x = m2();	// cal the m2 methods

	int m2(){
		System.out.println("non static M2");
		return 30;
	}

	{
		System.out.println("Non static block");
	}

	Sample(){
		System.out.println("conster");
	}

	Sample(int x){
		System.out.println("conster x:"+x);
	}

	void  m4(){
		System.out.println("nsm");
	}

	class A{
		 {
			System.out.println("inner class");
		}
	}
}
