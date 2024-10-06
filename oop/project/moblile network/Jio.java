public class Jio implements SIM
{
	private double balance ;
	public void recharge(Jio amt){
		this.balance = this.balance + amt;
		System.out.println("Jio SIm is recharged");
		currentBalance();
			
		
	}
	public void currentBalance(){
		System.out.println("Jio: SIM existing balance:"+balance);

	}
	public String call(long mn){
		return "Jio: the number you are dialing is currently swiched off.\n plese dial after some time";
	}
	public String sms(long mn,String msg){
		return "Jio: your message send sucessfully";
	}
}