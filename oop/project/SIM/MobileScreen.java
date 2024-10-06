import java.util.Scanner;
public class MobileScreen
{
	public static void main(String []args){
		Mobile iphone = new Mobile();
		Scanner scn = new Scanner(System.in);
		try{
			System.out.println("Insert SIM");
			iphone.insertSIM(scn.nextLine());
			System.out.println("SIM is Sucessfully activted");

			while (true)
			{
				System.out.println("\n choose one option");
				System.out.println("type 1 to recharge");
				System.out.println("type 2 to currentBalance");
				System.out.println("typr 3 to send call");
				System.out.println("type 4 to send sms");
				int option = scn .nextInt();
				scn.nextLine();
				switch (option)
				{
				case 1:
					System.out.println("Enter amount to recharge:");
					iphone.recharge(scn.nextDouble());
					break;
				case 2:
					iphone.currentBalance();
					break;
				case 3:
					System.out.println("Enter moblie number");
					String responce = iphone.call(scn.nextLong());
					System.out.println(responce);
					break;
					case 4:
						System.out.println("Enter moblie number :");
					long mn = scn.nextLong(); scn.nextLine();
					System.out.println("Type massage");
					String msg = scn.nextLine();
					 responce = iphone.sms(mn,msg);
					System.out.println(responce);
					break;
					default:
					System.out.println("Tumi fellow");
					System.out.println("choose valid option");

				}//switch close
			}//while close
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}