class CopyVereable
{
static int a ;
	static int m1(int a){
		CopyVereable.a = a;
		System.out.println("a:"+a);
		System.out.println("copVereable.a"+CopyVereable.a);
		return 50;
	}
	int m2(){
		System.out.println("NSM");
		return 10;
	}

	public static void main(String[] args) 
	{
		System.out.println("MM");
		int a=m1(20);
		System.out.println("static a:"+a);
		CopyVereable obj = new CopyVereable();
	int b = obj.m2();
		System.out.println(obj.m2());
		System.out.println(b);
		obj.m2(); // you hav to call not defing a return value assing a vareable thay hava not compile time errer


	}
}
