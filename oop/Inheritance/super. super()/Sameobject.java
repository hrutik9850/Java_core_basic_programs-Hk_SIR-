class SameObject01 
{
	SameObject01(){
		System.out.println("super clss" + this);
	}
}

class Sameobject extends SameObject01 
{
	Sameobject (){
		System.out.println("sub clss" + this);
	}
	public static void main(String[] args) 
	{
		Sameobject obj = new Sameobject();
		System.out.println("main methods " + obj );
	}
}
// prove the super class object is not created when subclass object is created
