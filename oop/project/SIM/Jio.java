public class Jio implements SIM
{
	private double balance;
	public void recharge(double amt){
		this.balance = this.balance + amt;
		System.out.println("jio SIM is recharged");
		currentBalance();
	}
	public void currentBalance(){
		System.out.println("Jio SIM existing balance:"+ balance);
	}
	public String call(long mn){
		return "jio the number you are dialing is currently busy \n ;oese dial dial after some time";
	}

	public String sms(long mn,String ){
		return "jio uour message send succefully";
	}
}