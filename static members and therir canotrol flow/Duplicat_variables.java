class Duplicat_variables 
{
	static int  a = 10;
	int a = 10 ;
	public static void main(String[] args) 
	{
		//it is allowed to define "a"variable in this method
	//	int a = 20;					//CE:variable a is already defined in class Duplicat_variables
		//crating local variable 
		int p = 10;
	//	double p = 30.0 ;			//CE:variable a is already defined in class Duplicat_variables
		
	}
	static void m1(){
		int p =20;
	}
}
