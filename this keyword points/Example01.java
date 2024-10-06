class Example01 
{	int x = 10;
	void m1 (){
		Example01 e1 = new Example01();
		System.out.println(e1.x);
	}
	void m2(){
		System.out.println(x);
	}
}
