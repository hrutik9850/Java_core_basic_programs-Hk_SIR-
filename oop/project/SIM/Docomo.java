public class Docomo implements SIM
{
	private double balance;
	public void recharge(double amt){
		this.balance = this.balance + amt;
		System.out.println("Docomo SIM is recharge ");
		currentBalance();
	}
	public void currentBalance(){
		System.out.println("Docomo SIM existing balance "+ balance);
	}
	public String call(long mn){
		return "Docomo: this number your are dialing is currently switched off in placeese dial after same time";
	}
	public String sms(long mn,String msg){
		return "Docomo :your message send sucsessfully";
	}

}