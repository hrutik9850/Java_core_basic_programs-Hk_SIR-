class Statc_vreable_Shared{
	static int a = 10;

	static void m1(){
		a = 50;
		System.out.println("From m1   a: "+a);
		
	}

	public static void main(String[] args) {
		System.out.println("From main a: "+a);
		m1();
		System.out.println("From main a: "+a);
	}
}

