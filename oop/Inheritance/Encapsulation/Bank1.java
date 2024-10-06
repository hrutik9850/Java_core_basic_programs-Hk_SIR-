import java.util.Scanner;
import java.util.InputMismatchException;
class Bank1
{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		BankAccount1 acc1 = new BankAccount1();
		while(true){
						try{
								System.out.println("\n Enter Balance:");
								double balance = scn.nextDouble(); scn.nextLine();
								acc1.setBalance(balance);
								System.out.println("current balance"+acc1.getBalance());
								break;	
							
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
//in above program we have used try/catch 
	//1. for catching	the exception thrown from setBalance() method
	//2. for stop terminating main method execution abnormally
	//3. for dispalying error message on console

//we also used e.getMessage() method, it is a predefined method available in
//Throwable class. It reads and returns the error message available in 
//exception object that is caught by catch block

//we used while loop for reexecuting the same code, when wrong values are passed
//in side loop we used break, for terminating loop, when correct value passed
