class IntegerNumber 
{
	public static void main(String[] args) 
	{
																			//type 2.rang 3can be stored displayed
		//System.out.println(12345678901);//CE:integer number too large
		System.out.println(12345678901L);									//long	yes		yes
		int i1=1;															//int    yes    yes
		System.out.println(i1);
		//int i2=12345678901;	//CE:integer umber too large				//int     no    no
		long l1=1;															//int     yes    yes
		System.out.println(l1);
		long l2= 1234567890;												//int     yes    yes
		System.out.println(l2);
		//long l2=123456778901;												//int		yes =>CE: integer number too large
		//long l3=(long)12345678901;//CE:integer number too large			//int		no    no
		long l4=1234567891L;											//long		yes  yes
		System.out.println("suffix of [L] used "+l4);												
	}
}
