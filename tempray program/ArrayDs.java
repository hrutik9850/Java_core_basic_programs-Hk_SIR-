class ArrayDs 
{
	public static void main(String[] args) 
	{
		int[] in = {43,54,34,5,6,77};
		for (int i = 0 ;i < in.length;i++)
		{
			System.out.print(in[i]);
			for (j= 0;j<=i;j++)
			{
				for (k = 0;k<=j;k++)
				{
					if (in.[j] <= in.[k])
					{
						in.[k] = in.[j];
					}
				}

			}
			System.out.print(in[i]);
		}

	}
}
