class Floatin_Number 
{
	public static void main(String[] args) 
	{
		//	float f1=10.9;					//CE: incompatible types: possible lossy conversion from double to float
																				// type	range	printin/staring/covering
		System.out.println(10.0);
		//System.out.println(10.0 9);	//' or ',' expected
		//System.out.println(10.0,9);// no suitable method found for println(double,int)
		System.out.println("Hello World!");
		//boolean b=2.0;												//double yes CE:ict double cant be co t0 boolean double yes no CE:plc from
		m1(10.0);
	//	float f1=10.9;		// incompatible types: possible lossy conversion from double to float	
	// m2((float)10.0);		//error: cannot find symbol
		m2(10.5f);
	}//main class 
	static void m1(float f){
		System.out.println("m1 float massage");
	}
	static void m1(double d){
		System.out.println("m1 boolean massage");
	}
	static void m2(float f){
		System.out.println("m2 float massage");
	}
		static void m2(double d){
		System.out.println("m2boolean massage");
	}
}
