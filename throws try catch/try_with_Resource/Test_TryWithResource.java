import java.io.PrintStream;
class Test_TryWithResource
{
	public static void main(String[] args) 
	{
		System.out.println("before try_with_resource");
		try(PrintStream pa = new PrintStream(System.out)){
			pa.println("Hi");
		}
		System.out.println("after try_with_resoutce");
	}
}
