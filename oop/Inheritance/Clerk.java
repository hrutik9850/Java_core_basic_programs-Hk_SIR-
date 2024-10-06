class Clerk 
{
	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount();
	//	acc1.balance = -50000.00;
	//	System.out.println(acc1.balance);
		acc1.setBalance(50000.00);
		System.out.println(acc1.getBalance());
		acc1.setBalance(-50000.00);
		System.out.println(acc1.getBalance());
	}
}
/*the process of defingi a class by hiding its data from direct acces from the outsid class 
members and providing its access.only through publicy accessible setter and getter methods with proper validationns is clled encapsulation */

