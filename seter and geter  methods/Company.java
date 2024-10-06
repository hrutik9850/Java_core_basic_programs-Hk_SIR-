class Company 
{
	public static void main(String[] args) 
	{
		Eemployee e1= new Eemployee();
		e1.display();
		e1.setEno(1010);
		e1.setEname("Hrurik Dharmkar");
		e1.setSal(1000);
		e1.display();
		System.out.println(e1.getSal());
		System.out.println(e1.getEno());
		System.out.println(e1.getEname());
		/*e1.getSal(											do not adastand  tis metnods
			e1.getSal()+
			e1.getSal()*20+100);		*/
		System.out.println(e1.getSal());


	}
}

