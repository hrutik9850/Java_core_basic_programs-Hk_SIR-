class BooleanValue 
{
	static void add (int a){
		if(a<0){
			System.out.println("Do not Passtive value numbe");

		}
		else{
			System.out.println(a+20);
		}
	}
	static void condd(int a){
		
		//if (a=10)						//CE: incompatible types: int cannot be converted to boolean
			if (a==10)
		{
			System.out.println("HRU");
		}
		else{
			System.out.println("WRU");
		
		}
	}
	static void mood(int a){
		if (a%2==0)
		{
			System.out.println("it is mood by"+a);
		}
		else{
			System.out.println("it is not mood by"+a);
		}
	}
	public static void main(String[] args) 
	{

		BooleanValue.add(10);
		BooleanValue.add(-10);
		BooleanValue.condd(30);
		BooleanValue.condd(10); //if condtion argument must be boolean type .the opertor we hve used int the condition must generator bolean type reslt
		BooleanValue.mood(20);//  =operater generates result based on the variable type here variable type is int so result is also int type 
		BooleanValue.mood(17);		//sole above errer,we must use==operater to complare a variable with 10 to generate boolean value/fase 
		boolean bo3=true;
		if (bo3=true)
		{
			System.out.println("in if");
		}
		else{
			System.out.println("in else");
		}
		boolean bo4=false;
		if (bo4=false)
		{
			System.out.println("In if ");
		}
		else{
			System.out.println("in else");
		}
		boolean bo5= false;
		if (bo5==false)
		{
			System.out.println("in if");
		}
		else{
			System.out.println("if else");		
			}
			int b=30;
			int c=b%2;
			System.out.println(c);
	}
}
