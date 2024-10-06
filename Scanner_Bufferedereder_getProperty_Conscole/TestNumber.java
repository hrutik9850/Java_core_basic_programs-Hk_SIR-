import java.util.Scanner;
class TestNumber 
{
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
	//	System.out.println("Hello World!");
		int a = scr.nextInt();
	//	System.out.println(a);
		boolean erv=Numbertype.Num(a);
		if(erv){
			System.out.println("this numbr is even"+a);
		}
		else{
			System.out.println(" this number is not even:" +a);
		}
	}
}
class Numbertype
{
	static boolean Num(int na){
	if(na % 2==0){
	return true;
		}
		return false;
	}
}