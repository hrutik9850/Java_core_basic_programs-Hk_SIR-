class Parametervalu
{
	static double add(double a,int b){
	double c=a+b;
	//System.out.println("add a+b=:"+c);
	return c;
	}
	static void sub(int a,int b){
		int c = a-b;
		System.out.println("sub a+b=:"+c);
	}
	public static void main(String[] args) 
	{
		double a = add(33,66);
		System.out.println(a);
		sub(44,20);
	
	}
	
}
