import java.util.Scanner;
import java.util.InputMismatchException;

class Bank{
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		BankAccount1 acc1 = new BankAccount1();

		while(true){
			try{
				System.out.print("\nEnter Balance: ");
				double balance = scn.nextDouble();    scn.nextLine();   
				acc1.setBalance(balance);
				System.out.println("current balance: "+ acc1.getBalance());
				break;
			}catch (InputMismatchException e)	{
				System.out.println("Enter only number");
				scn.nextLine(); //removing wrong data from Scanner object
			}catch (IllegalArgumentException e)	{
				System.out.println(e.getMessage());
			}
		}//while end
	}
}
