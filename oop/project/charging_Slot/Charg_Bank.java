interface Battery
{
	void charg();
	void remove();
}
class Iphom_charger implements Battery
{
	public void charg(){
		System.out.println("your movbile chargs");
	}
	public void remove(){
		System.out.println("your moblie chargs complite");
	}

}
class Typec_charger implements Battery
{
	public void charg(){
		System.out.println("your movbile chargs");
	}
	public void remove(){
		System.out.println("your moblie chargs complite");
	}

}
class Normal_charger implements Battery
{
	public void charg(){
		System.out.println("your movbile chargs");
	}
	public void remove(){
		System.out.println("your moblie chargs complite");
	}

}
class Charging_Slot
{
	void Atacha_charger(Battery ba){
		ba.charg();
		ba.remove();
		
	}

}
class Charg_Bank
{
	public static void main(String[] args){
		Charging_Slot cs = new Charging_Slot();
		cs.Atacha_charger( new Typec_charger());
	}
	
}

