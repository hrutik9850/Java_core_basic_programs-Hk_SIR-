class Static_Methods2 
{
	static int a;
	static int b;
	static{
		System.out.println(a);
		System.out.println(b);
	}
	static void m1(){
		System.out.println("m1");
		a = 10;
		b = 20;
	}
	static void m2(int x, int y){
		System.out.println("m2");
		a = x;
		b = y;

	}
	static void m3(int a, int b){
		System.out.println("m3");
		a = a;
		b = b;
	}
	static void m4(int a,int b){
		System.out.println("m4");
		Static_Methods2.a = a;
		Static_Methods2.b = b;
	}
	public static void main(String[] args) 
	{
		System.out.println(a+"...."+b);
		System.out.println();
		m1();
		System.out.println(a+"....."+b);
		System.out.println();
		m2(30,40);
		System.out.println(a+"......"+b);
		System.out.println();
		m3(50,60);
		System.out.println(a+"......"+b);
		System.out.println();
		m4(70,80);
		System.out.println(a+"......."+b);
	}
}
/*output
0
0
0....0

m1
10.....20

m2
30......40

m3							//not chan value 
30......40

m4
70.......80
*/
