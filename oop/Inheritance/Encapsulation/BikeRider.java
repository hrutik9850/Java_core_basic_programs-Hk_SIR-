import java.util.Scanner;
import java.util.InputMismatchException;
class BikeRider 
{
	
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		Bike b1 = new Bike();
		while (true){
			try
			{
				System.out.println("\n change gear:");
				b1.setGear(scn.nextInt());
				b1.currentGear();

			}
			catch (InputMismatchException e)
			{
				System.out.println("pass only integer");
				scn.nextLine();
			
			}
			catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			}
		}
		
	}
}
