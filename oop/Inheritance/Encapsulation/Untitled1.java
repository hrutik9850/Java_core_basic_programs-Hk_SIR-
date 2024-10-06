class BankAccount1 
{
	private double balance;
	public void setBalance (double balance){
		throws IllegalArgumentException{
			if (balance == 0)
			{
				IllegalArgumentException("Donot pass zero");
			}
			if (balance < 0)
			{
				IllegalArgumentException("Donot pass -ve amoutn");
			}
			this.balance = balcnce;
	}
	public double getBalance(){
		return balance;
	}

}
import java.util.Scanner;
import java.util.InputMismatchException;
class Bank
{
	public static void main(String[]args){
		scanner scn = new scanner(System.in);
		BankAccount1 acc1 = new BankAccount1();
		while(true){
						try{
								System.out.println("\n Enter Balance:");
								double balance = scn.nextDouble(); scn.nextLine();
								acc1.setBalance(balance);
								System.out.println("current balance"
								+acc1.getBalance);
								
								brack ;
							} 
								catch(InputMismatchException e){
									System.out.println("Enter only number");
									scn.nextLine();
							}
							catch(IllegalArgumentException e){
								System.out.println(e.getMessage());
							}
		}
	}
}
