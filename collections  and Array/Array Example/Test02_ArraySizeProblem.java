class Test02_ArraySizeProblem 
{
	public static void main(String[] args) 
	{
		String[] sa = new String[5];
		sa[0] = "abac";
		sa[1] = "sas";
		sa[2] = "kdhd";
		sa[3] = " dkd";
		sa[4] = "kdjd";
	//	sa[5] = "dkd";
		System.out.println("values are stored in array");
		String[] sa2 = new String[10];
		for(int i = 0;i <sa.length;i++)
		{
			sa2[i] = sa[i];
		}
		sa = sa2;
	
	sa[5] = "f";
	sa[6] = "d";
	sa[7] = "f";
	sa[8] = "d";
	for (int i =0;i<sa.length;i++ )
	{
		System.out.println(sa[i]);
	}
	
		System.out.println("values are stored in array 2");



	}
}
