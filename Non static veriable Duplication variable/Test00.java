class Test00 
{
	int x = 10;
	int y = 20;
	void m1 (int a ,int b){
		x = a;
		y = b;

	}
	void m2(int a, int b ){
		x = x;
		y = y;

	}
	void m3(int x ,int y){
		this.x = x;
		this.y = y;

	}

	public static void main(String[] args) 
	{
		System.out.println("main start");
		Test00 t1 = new Test00();
		System.out.println(t1.x +" " +t1.y);
		t1.m1(30, 40);
		System.out.println(t1.x +" " +t1.y);
		t1.m2(50, 60);
		System.out.println(t1.x +" " +t1.y);
		t1.m3(70, 80);
		System.out.println(t1.x +" " +t1.y);

	}
}
