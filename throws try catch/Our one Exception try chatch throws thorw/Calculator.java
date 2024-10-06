

import java.util.Scanner;
import java.util.InputMismatchException;

class Calculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while(true) {		
			try{	
				System.out.print("\nEnter FNO: ");
				int a = scn.nextInt();

				System.out.print("Enter SNO: ");
				int b = scn.nextInt();

				int c = Addition.add( a , b);
				System.out.println("Result: "+c);

			}catch(InputMismatchException e){
				System.out.println("Please pass only integer");
				scn.nextLine();
			}catch(NegativeNumberException e){
				System.out.println(e.getMessage());
			}
		}//while close
    
	}
}
//Addition.java
class Addition {
	static int add(int a, int b) 
						throws NegativeNumberException {

		if(a < 0  || b < 0)
			throw new NegativeNumberException(
							"Do not pass -ve numbers");
		

		return a + b;
	}
}
 


 //NegativeNumberException.java
class NegativeNumberException extends Exception {
	
	NegativeNumberException(){
		super();
	}

	NegativeNumberException(String msg){
		super(msg);
	}

}