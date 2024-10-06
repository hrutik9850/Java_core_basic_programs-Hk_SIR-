class Division02
{
	public static void main(String[]args)
	{
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("Result"+c);
		}catch(ArrayIndexOutOfBoundsException e1 ){
			System.out.println("plese pass atleast two integer values");
		}catch(NumberFormatException e2){
			System.out.println("please ");
		}catch(ArithmeticException e3){
			System.out.println("please DONOT pass second value as ZERO");
		}
	}
}

