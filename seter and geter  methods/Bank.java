class Bank 
{
	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount();
		System.out.println(acc1.isActive());
		if (acc1.isActive())
			System.out.println("Active");
		else 
			System.out.println("no Active");
		acc1.setActive(true);
		System.out.println(acc1.isActive());

	}
}
