import java.util.Scanner;
class MobileScreen 
{
	public static void main(String[] args) 
	{
		Mobile iphone = new Mobile();
		Scanner scn = new Scanner(System.in);
		try{

		System.out.println("Insert SIM");
		iphone .insertSIM(scn.nextLine());
		System.out.println("SIM is sucessfully activated");
		while (true)
		{
			System.out.println("\n choose one option");
			System.out.println("type 1 to recharge");
			System.out.println("type 2 to currentBalance");
			System.out.println("type 3 to send sms");
			System.out.println("type 4 to send sms");
			System.out.println("\n Enter option");
			int option = scn.nextInt();scn.nextLine();
			switch (option)
			{
			case 1:
				System.out.println("Enter amount to Recharge:");
				iphone.recharge(scn.nextDouble());
				break;
			case 2:
				iphone.currentBalance();
				break;
			case 3:
				System.out.println("Enter mobile number:");
				String response = iphone.call(scn.nextLong());scn.nextLine();
				System.out.println("response");
				break;
			case 4:
				System.out.println("Exter mobile number");
			long mn = scn.nextLong();scn.nextLine();
			String msg = scn.nextLine();
			response = iphone.sms(mn,msg);
			System.out.println(response);
			break;
			default:
			System.out.println("Tumri fellow");
			System.out.println("choose valid option");
			}//switch close



			
		}//while close



		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
