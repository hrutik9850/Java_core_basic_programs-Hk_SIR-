class TryDemo2 
{
	public static void main(String[] args) 
	{
		try{
			System.out.println("In outer try");
			try{
				System.out.println("In inner try");
				System.out.println(10/0);
			}
			catch(NumberFormatException e){
				System.out.println("In inner catch");
			}
			System.out.println("After inner try/catch");
		}
		catch(NumberFormatException e){
			System.out.println("In outer catch");
		}
		System.out.println("After outer try/catch");
	}
}
