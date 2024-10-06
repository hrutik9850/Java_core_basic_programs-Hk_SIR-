// more than one try/catch blocks in a methods?
class More_try_catch 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		try{
			System.out.println( "in try1");
		}
		catch(Exception e){
			System.out.println("catch1");
		}
		System.out.println("after try /catch1");
		try{
			System.out.println("in try2");
		}catch(Exception e){
			System.out.println("catch2");
		}
		System.out.println("after /catch2");
	}
	
}
