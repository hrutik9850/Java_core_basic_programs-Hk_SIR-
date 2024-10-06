class ConstructorNOp
{
	int a = 30;
	{
		System.out.println(" super class"+a);
	}
}



class NoprameterC extends ConstructorNOp  
{
	public static void main(String[] args) 
	{
		System.out.println("main main");
	//NoprameterC obj = new NoprameterC( 10);		//CE:constructor NoprameterC in class NoprameterC cannot be applied to given types;
	//ConstructorNOp obj1 = new ConstructorNOp(20);//CE:constructor ConstructorNOp in class ConstructorNOp cannot be applied to given types;
		NoprameterC obj2 = new NoprameterC();
		ConstructorNOp obj3 = new ConstructorNOp();

		System.out.println("end main");
	}
}
