class MyThread13 extends Thread  
{
	public void run(String a){
		System.out.println("run MyThread");
	}
}
class Test15
{
	public static void mian(String[]args){
		MyThread13 mt = new MyThread13();
		mt.start("abc");
	}
}
