public class Airtel implements SIM
{
	private double blance;
	public void recharge(double amt){
		this.blance = this .blance + amt;
		System.out.println("Airtel SIM is  recharged");
		currentBalance();
	}
	public void currentBalance(){
		System.out.println("Airtel SIM existing blance:"+blance);
	}
	public String call(long mn){
		return "Airtel: This number you are dialing is currenty busy.\n please dial after some time"; 
	}



	public String sms(long mn, String msg){
		return "Airtel :your message send sucessfully";
	}
}