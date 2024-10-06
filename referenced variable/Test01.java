//Q1) What is a referenced variable?
	/*
	 * A variable that is created by using a referenced data type is called referenced variable.
	 * The referenced data type can be an array/class/interface/abstract class/final class/enum/annotation.
	 */

//Q2) Why referenced variable?
	/*
	 * Referenced variable is used for storing an object reference
	 * for acessing/reusing the members available in this object 
	 * in the next lines of code either in the same class or from other classes. 
	 */

//Q3) How can create referenced variable?
	/*
	 *  By using referenced data type
	 *
	 *  Syntax:
	 *		RDT  varName ;								
	 *			Or
	 *		RDT  varName = new RDT();		
	 */

//Q4) Diff terminology we come accross while working with referenced variable?
	/*
	 *		RDT  varName ;					//ref varaible declaration
	 *
	 *		RDT  varName = new RDT();		//ref variable definition
	 *
	 *				  varName = new RDT();	//ref variable assignment
	 *
	 *				  varName.xxx;			//acessing ref variable to invoke the members 
	 *													//available in this object 
	 */
//Q5) Below program explains creating referenced variable by using an array and class

class Example {
	int x = 10;
	int y = 20;
}

class Test01{
	public static void main(String[] args) {
		//int[] type variable declaration
		int[] ia1;

		//int[] type variable definition
		int[] ia2 = new int[5];

		//int[] variable assignment
		ia1 = new int[7];
x
		//reading accessing array referenced variable to display its value
		System.out.println(ia1);
		System.out.println(ia2);
		System.out.println();

		//Example class type ref var declaration
		Example e1;

		//Example class type ref var definition
		Example e2 = new Example();

		//Example class type ref var assignment
		e1 = new Example();

		//accessing referenced variable 
		System.out.println(e1);
		System.out.println(e2);
		System.out.println();

		String s1 = "Hari";
		System.out.println(s1);

	}
}