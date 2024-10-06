import java.util.Scanner;
class Test0_Collage 
{	public static void main(String[]agrs){
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter your name ");
		String SName=scr.nextLine();
	System.out.println("Enteer sub name");
		String Subname = scr.nextLine();
	System.out.println("Enteer a gender");
		char gender =scr.next().charAt(0); 
	System.out.println("Enter your mobile");
		long MobNo=scr.nextLong(); 
	System.out.println("Enter your ID number");
		int ID=scr.nextInt(); 
	System.out.println("Enter your RollNO ");
		int RollNO=scr.nextInt(); scr.nextLine();
	System.out.println("Enter your Address");
		String Address=scr.nextLine();
		System.out.println();
		System.out.println("=====================================================");
	
	System.out.println("Name:"+SName);
	System.out.println("Subname:"+Subname);
	System.out.println("gender:"+gender);
	System.out.println("MobNo:"+MobNo);
	System.out.println("ID:"+ID);
	System.out.println("RollNO:"+RollNO);
	System.out.println("Address:"+Address);
		
	}
	
}
