class A1 
{
	static int a =10;
	static {
		System.out.println("Hi");
	}

}
class B1 extends A1
{
	static int b =20;
	static{
	System.out.println("Hello");	
	}

}
class Test
{
	public static void main(String []args){
		System.out.println(B1.a);
	}
}
