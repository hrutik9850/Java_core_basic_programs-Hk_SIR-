class Integer 
{
	public static void main(String[] args) 
	{
		//boolean bo =10;    //CE:imcompatiable  type int can not be converted to boolean with this CE:
							//compatiler tells us integer 10 defult type is int 

		int il = 10;
		m1(10);
		m1(il);
		System.out.println();
		//  1. by using assignment operater(=)
		byte  b1 =10;//here 10 is of type byte
		short s1 =10;//here 10 is of the short
		long l1 =10;//here  10 is of the short
		m1(b1);
		m1(s1);
		m1(l1);
		System.out.println();
		//2. by using cast operator [(datatype) value]		
		m1(10);				//m1 (int param)method is executed
		m1((byte)10);		//m2 (byte param)method is excected
		m1((short)10);		//m3 (short param)method is excected
		m1((long)10);		//m4 (long param)method is excected 
			System.out.println();
			//3. by using suffix charater(l/L)
		m1(10);
		m1(10L);
		m1(10l);
		//m1(10b);		    //we dont have suffix charater byte and short type
		//m1(10B);     		//we dont have suffix charater byte and short type
		//m1(10S);			//we dont have suffix charater byte and short type
		//m1(10S);			//we dont have suffix charater byte and short type

	}//main cose
	static void m1(byte b){
		System.out.println("byte param method ");
	}
	static void m1(short s){
		System.out.println("short param method ");
	}
	static void m1(long l){
		System.out.println("long param mathod ");
	}
	static void m1(int i){
		System.out.println("int param mathod");
	}
}








