class TypeConvergan 
{
	public static void main(String[] args) 
	{
	System.out.println("implicit conversion");
		System.out.println("type convergan ");
		int c1=10;				//int size 4bytes
		float c2=c1;			//float size 8 bytes
		System.out.println(c2);
		long c3=38393;				//long  size 16 bytes
		short c4=(short)c3;//Explicit conversion    short size 2btes
		System.out.println(c4);
		float c5=108.3f;
		long c6=(long)c5;
		System.out.println(c6);
		double c7=33.4;
		float c8=(float)c7;
		System.out.println(c8);
		byte c9=12;
	//	boolean c10=c9;
	//	System.out.println(c10);
		int  c10=21;
		//char c11=c10;		CE:incompatable int value can not store char
		char c11=(char)c10;
		System.out.println(c11);//int value conversion to the char 
		int  c12=95;
		char c13=(char)c12;
		System.out.println(c13);
		char c14='A';		//char value direct convert to the int type conversion auto conversion
		int c15 =c14;
		System.out.print("c14:=="+c14);
		System.out.println("---c15:="+c15);
		char c16= 'Z';
		int c17=c16;
		System.out.print("c16:="+c16);
		System.out.println("--c17:="+c17);
		int c18=91;
		char c19=(char)c18;
		System.out.print("c18:="+c18);
		System.out.println("--c19:="+c19);
	//	long c20=123456789012;			//long int type value by defol conside int type value 
		long c20=1234525363546l;		//by us int suff carater [L/l]
		int c21=(int)c20;	System.out.println("c21"+c21);
		byte c22=45;
		//boolean c23=c22;		//CE:incompatible types: byte cannot be converted to boolean
		char c23=(char)c22;
		System.out.println("c23"+c23);
		short c24= 267;
		int c25=c24;
		System.out.print("c24:="+c24);
		System.out.println("--c25:="+c25);
		//rule#1
		//source and destination data type must be compatible otherwis it leads to compile time error "incompatible types"
		//Except boolean all primitive data types are compatible .it means boolean value or varivble cannot be assigned to 
		//any other data type varible .
		int c26 =10;
		float c27= c26; System.out.println(c27);
		//boolean c28=c26;		CE:possible loss of precision
		//rule#2
		//source type rang must be iess thean or equals to destination type range ,otherwise it leads to CE: Possible loss precision
		float c28=10;
		float c29=c28;	System.out.println(c29);
		double c30=c28; System.out.println(c30);
		int  c31=(int)c28;	System.out.println(c31);
		int c32=15;
		//byte c33=c32;
		byte c33=(byte)c32; System.out.println(c33);
		//byte c34=(short)(byte)c33; System.out.println(c34); //CE: incompatible types: possible lossy conversion from short to byte
		byte c34=(byte)(short)(int)(char)c32; System.out.println(c34);
		byte c35=(byte)(short)(double)(float)(char)c32; System.out.println(c35);
		byte c36=(byte)(int)(long)c32;System.out.println(c36);
		//byte c37=(byte)(int)(boolean)(long)c32;System.out.println(c37);
		//CE: incompatible types: long cannot be converted to boolean



	}
}
