class Test10 
{
	public static void main(String[] args) 
	{	String [] s = null;
		char [] ch = null;
		int [] in = null;
		System.out.println("s:"+s);
		System.out.println("ch:"+ch);
		System.out.println("in:"+in);
										//now we donot get NPE
										//here + operator has null handing code
	}

}
