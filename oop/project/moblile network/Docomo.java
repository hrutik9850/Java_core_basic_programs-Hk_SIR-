public class Docomo implements SIM
{
	private double balance ;
	public void recharge(double amt){
		this.balance = this.balance +amt;
		System.out.println("Docomo SIm is recharged");
		currentBalance();
			
		
	}
	public void currentBalance(){
		System.out.println("Docomo: SIM existing balance:"+balance);

	}
	public String call(long mn){
		return "Docomo: the number you are dialing is currently swiched off.\n plese dial after some time";
	}
	public String sms(long mn,String msg){
		return "Docomo: your message send sucessfully";
	}
}