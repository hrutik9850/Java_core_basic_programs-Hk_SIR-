public class Airtel implements  SIM
{
	private double balance;
	public void recharge (double amt){
		this .balance = this.balance + amt;
		System.out.println("Airtel SIM is recharged ");
		currentBalance();

	}
	public void currentBalance(){
		System.out.println("Aitel SIM Existing balance:"+ balance);

	}
	public String call(long mn){
		return"Aritel:this numberers you are dialing is currently some time";
	}
	public String sms(long mn, String msg){
		return "Aritel:your maessage send success fully";
	}
}