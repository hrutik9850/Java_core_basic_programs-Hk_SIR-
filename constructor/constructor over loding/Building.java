class Building
{
	public static void main(String []args){
	//	Rom r1 = new Rom ();		CE: c f s Rom();
	//because comiler does not add default constructor 
	Rom r1 = new Rom(100,30);	
		System.out.println("rl values ");
		r1.display();
		System.out.println();
		r1.findArea();
		System.out.println();
		r1.setL(100);
		r1.setB(50);
		System.out.println("r1 changes");
		r1.display();
		System.out.println();
		r1.findArea();
	}
}