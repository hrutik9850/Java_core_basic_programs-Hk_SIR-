public class Main 
{
	private int i=1;
	public static void main(String[] args) 
	{
		int i=2;
		Main s=new Main();
		someMethod();
		System.out.println(i);
	}
	static void someMethod(){
		System.out.println(i);//CE:rererence datat type is i ther some type erro are denoted by
	}
}
