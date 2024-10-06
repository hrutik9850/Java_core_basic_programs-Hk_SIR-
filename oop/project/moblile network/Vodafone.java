public class Vodafone implements SIM
{
	private double balance ;
	public void recharge(double amt){
		this.balance = this.balance +amt;
		System.out.println("Vodafone SIm is recharged");
		currentBalance();
			
		
	}
	public void currentBalance(){
		System.out.println("Vodafone: SIM existing balance:"+balance);

	}
	public String call(long mn){
		return "Vodafone: the number you are dialing is currently swiched off.\n plese dial after some time";
	}
	public String sms(long mn,String msg){
		return "Vodafone: your message send sucessfully";
	}
}