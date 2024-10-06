//**************Twest points#3*****************
class Test09 
{
	public static void main(String[] args) 
	{	 char[] ch = null;
		int [] ia = null;
		String [] s = null;
		System.out.println(s);	//null
		System.out.println(ia);
	//	System.out.println(ch);//in println(char[]) param method
						//null handling is not there, so we will get NPE
						//in all other parameter println() methods
						//we have null handling, just null is converted to String as "null"
						//and directly null is displayed

	}
}
