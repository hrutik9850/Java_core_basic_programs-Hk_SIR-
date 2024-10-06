class Local_Variables_Parametere_as_static 
{
	static  int a = 10;
	public static void main(String[] args) 
	{
		//static int b =20;		//CE: illegal start of expression
	}
}
/*Can we declare local variables or parameters as static 
No, it is not possible .It leads to CE: "illegal start of expression"  Static keyword is not allowed
inside block "{}", bacause as being a static variable int must get memory at the time of class loading
whic is not possibal to provide memory  to baribale at time of class loading */