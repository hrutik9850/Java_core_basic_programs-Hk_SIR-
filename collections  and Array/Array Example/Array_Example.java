class Array_Example  
{
	public static void main(String[] args) 
	{
		int[] ia = new int[3];
		ia [0] = 10;
		ia [1] = 20;
	//	ia [0] = 20.4 ;		//CE:incompatible types: possible lossy conversion from double to int
	//	ia [1] = true ;		//CE:incompatible types: boolean cannot be converted to int
		ia [2] = 'a';
	//	ia [0] = "abc";		//CE:incompatible types: String cannot be converted to int

		for (int i = 0;i <= ia.length;i++)
		{
			System.out.println("int array:"+ia[i]);
		}
		double[] de = new double[10];
		de [0] = 10;
		de [1] = 'a';
		de [2] = 32.5;
		de [3] = 12.9f;
	//	de [4] = "abc";		//CE:incompatible types: String cannot be converted to double
	//	de [5] = true;		//CE:incompatible types: boolean cannot be converted to double

	try
	{
		for (int i = 0;i <= de.length;i++)
		{
			System.out.println("int array:"+de[i]);
		}


		
	}
	catch(ArrayIndexOutOfBoundsException.e)
	{
		e.printStackTrace();
	}
	catch(Exception.e)
	{
		e.printStackTrace();
	}
		
	}
}
