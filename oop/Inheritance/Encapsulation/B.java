class B extends A 
{
	static int b = 20;
	static {
		System.out.println("In  B SB");
		System.out.println("a:"+ a);
		System.out.println("b:"+b);
		System.out.println("b:"+B.getB());
	}
	static int getB(){
		return b;
	}
	public static void main(String[]args){
		System.out.println("IN B main");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	
}
