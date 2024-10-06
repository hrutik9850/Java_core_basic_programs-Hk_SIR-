class Addition 
{
	public static void main(String[] args) 
	{
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("Result:"+c);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Result:"+(4+5));
		}catch(NumberFormatException e){
			System.out.println("Result:"+(6+4));
		}catch(ArithmeticException e){
			System.out.println("Result:"+(8+5));
		}
	}
}
