//Develop multiple custom threads for creating two tesks 
//addiing number 1-20
//subtracting number 1-20
// by two diff custom theads
class AddThread extends Thread 
{
	@Override 
		public void run(){
			int sum =1;
			for (int i =2;i<= 20;i++)
			{
				sum = sum+1;
				System.out.println("summation :"+ sum);

			}
		}
}
class SubThread extends Thread 
{

	@Override 
		public void run(){
			int sub = 1;
			for (int i = 1;i <= 20;i++)
			{
				sub = sub - i;
				System.out.println("Summation :"+sub);
			}
		}
}
class MulThread extends Thread 
{
	@Override 
		public void run(){
			int mul = 1;
			for (int i = 1;i <= 20 ;i++)
			{
				mul = mul * i;
				System.out.println("Summation :" + mul);
			}
		}
}
public class Test11_MultipleCTS_withDiffLogic
{
	public static void main(String []args){
		AddThread add = new AddThread();
		SubThread sub = new SubThread();
		MulThread mul = new MulThread();
		add.start();
		sub.start();
		mul.start();
	}
}

