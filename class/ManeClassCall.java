public class ManeClassCall 
{
	static void m1(){
			System.out.println("mane m1");
		}
	public static void main(String[] args) 
	{
		System.out.println("main calss call");
		
		Call.m1();
	}
}
class Call
{
	public static void main(String[]args){
	ManeClassCall.main(new String[0]);
	ManeClassCall.m1();
	
	}
	static void m1(){
		System.out.println("call m1");
		}
}
