class Bank 
{
	public static void main(String[] args) 
	{
		BankAcount.bankname ="SBI";
		BankAcount.branchname ="akola_dapki_rod_141";
		BankAcount.ifsc		=	"SBI4003DR";
		BankAcount acc1 = new BankAcount();
		BankAcount acc2 = new BankAcount();
		acc2.accnumber=873465283498L;
		acc2.accname="hrutik dharamkr";
		acc2.balance=99949494;

		System.out.println("acc1");
		System.out.println("acc1.bankname\t\t"+acc1.bankname);
		System.out.println("acc1.branchname\t\t"+acc1.branchname);
		System.out.println("acc1.ifsc:\t\t"+acc1.ifsc);
		System.out.println("acc1.accnumber:\t\t"+acc1.accnumber);
		System.out.println("acc1.accname:\t\t"+acc1.accname);
		System.out.println("acc1.balance:\t\t"+acc1.balance);

		System.out.println("acc2");
		System.out.println("acc2.bankname\t\t"+acc2.bankname);
		System.out.println("acc1.branchname\t\t"+acc2.branchname);
		System.out.println("acc2.ifsc:\t\t"+acc2.ifsc);
		System.out.println("acc2.accnumber:\t\t"+acc2.accnumber);
		System.out.println("acc2.accname:\t\t"+acc2.accname);
		System.out.println("acc2.balance:\t\t"+acc2.balance);
	}
}
