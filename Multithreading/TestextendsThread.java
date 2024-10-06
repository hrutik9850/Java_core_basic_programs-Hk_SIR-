
class TestextendsThread
{
	public static void main(String[]arsg){
		System.out.println("main start");
		MyThread th = new MyThread();
		th.start();
		System.out.println("main end");

	}
}