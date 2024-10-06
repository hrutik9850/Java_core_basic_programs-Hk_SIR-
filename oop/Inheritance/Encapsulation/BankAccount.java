class BankAccount 
{							//in java we developed encapsulation 
private double  balance;	//1.by declering all variables as private
							//2.by defining on pair public set and get methods
	public void setBalance(double balance){
		if(balance <= 0){
			System.out.println("Do not enter -ve amount");
		}
		else{
			this.balance = balance;
		}
	}
	public double getBalance(){
		return balance;
	}
}
