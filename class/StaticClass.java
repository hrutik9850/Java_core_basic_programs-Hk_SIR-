class StaticClass
{
/*	int v1=99;
	int v2=87;
	byte v3=12;
	short v4=200;
	boolean v5= true;
*/
	static int s1= 99;
	static int s2=44;
	static byte s3=33;
	static short s4=200;
	static boolean s5 = false;
	public static void main(String[] args) 
	{
		
	//	System.out.println(vl);			 variable v1 cannot be referenced from a static context
	//	System.out.println(v2);			 variable v2 cannot be referenced from a static context
	//	System.out.println(v3);			 variable v3 cannot be referenced from a static context
	//	System.out.println(v4);			 variable v4 cannot be referenced from a static context
	//	System.out.println(v5);			 variable v5 cannot be referenced from a static context
	//---------------------------------------------------------------------------------------------
	System.out.println("static ashing value");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	}
}
