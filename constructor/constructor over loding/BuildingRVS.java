import java.util.Scanner;

class BuildingRVS 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter lenth l:");
		double l = scn.nextDouble();
		System.out.println("Enter brath b:");
		double b = scn.nextDouble();
		Rom r1=new Rom(l, b);
		System.out.println("r1 values");
		r1.display();
		System.out.println();
		r1.findArea();
		System.out.println();

		System.out.println("Enter modifie l:");
		r1.setL(scn.nextDouble());
		System.out.println("Enter modifies b:");
		r1.setB(scn.nextDouble());
		System.out.println("r1 changed:");
		r1.display();
		System.out.println();
		r1.findArea();

	}
}
