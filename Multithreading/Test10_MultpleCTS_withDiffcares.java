class MyThread6 extends Thread
{
	private int x;
	public MyThread6(int x){
		this .x = x;

	}
	public void run(){
	
		for (int i = 1;i<=x;i++)
		{
			System.out.println(getName() + " run :"+ i);
		}
	}
}
public class Test10_MultpleCTS_withDiffcares
{
	public static void main(String []args){
		MyThread6 mt1 = new MyThread6(10);
		mt1.start();
		MyThread6 mt2 = new MyThread6(15);
		mt2.start();
		
	}
}