
class Test01String  
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to string program fast ");
		String s1 = new String ("hari kishan");
		byte [] b = {45,33,54,64,33,32};
		//-------------------------------------------------------------
		System.out.println("string s1:"+ s1);
		System.out.println("byte array:"+b);
		//	String s2 = new String (b , -2 , 4);
		String s3 = new String (b, 2 , 4 );
	//	String s4 = new String (s1 , 2,5);			//CE:no suitable constructor found for String(String,int,int)
		System.out.println("s3 :"+s3);
		System.out.println("s1.length:"+ s1.length());

		//String s5 = new String (b , 6 ,4) ;		RE:Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range														[6, 6 + 4) out of bounds for length 6
	//	String s6 = new String (b , 3 ,-2) ;		RE:Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range															[4, 4 + -2) out of bounds for length 6
	//	System.out.println("S5 :"+ s5);
	//	System.out.println("s6 :"+ s6);

	String s7 = new String(b, 1 , 3);
	System.out.println("s7 :" + s7);
	System.out.println("s7 length:" + s7.length());




	}
}
