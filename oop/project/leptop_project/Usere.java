interface Pendroy 
{
	void CopyAndPast();
	void Delete();
}
class Sandisk implements Pendroy 
{
	public void CopyAndPast(){
		System.out.println("sandisk ia copy past");
	}
	public void Delete(){
		System.out.println("Sandisk is delete");
	}
}
class Hp implements Pendroy 
{
	public void CopyAndPast(){
		System.out.println("Hp is  a copy past");
	}
 public void Delete(){
		System.out.println("Hp is a delete");
	}
}
class Migs implements Pendroy 
{
	public void CopyAndPast(){
		System.out.println("migs is copy past");
	}
	public void Delete(){
		System.out.println("misgs is  Delete");
	}

}
class Leptop
{
	void connest(Pendroy p1 ){		//Luse cupling 
		p1.CopyAndPast();	
		p1.Delete();
		
	}
}
class Usere 
{
	public static void main(String []args){
		Leptop l1 = new Leptop();
		l1.connest(new Hp());
	}
}