class Aa
{
	static void m1(int a,int b){
		int c =a+b;
		System.out.println("some of "+c);
		Aa  ob = new Aa();
		ob.m2();
	}
		private void m2(){
	System.out.println("private");
	}
	
}
class ExampleMain
{
	public static void main(String[]args){
		Aa.m1(22,44);
		Aa.m2();			//CE:  m2() has private access in Aa
		Aa ob1 = new Aa();	
	//	ob1.m2();			//CE:  m2() has private access in Aa

	}
}
