//Q6) What are the diff types of referenced variables Java supports?
	/*
	 * Based on the place we declared, referenced variables are divided into 4 types
	 *			1) static referenced variable
	 *			2) non-static referenced variable
	 *			3) parameter referenced variable
	 *			4) local referenced variable
	 */

//Below program shows creating all above 4 types of variables
class Example{
	int x;
	int y;
}

class Sample{
	static Example e1;							
	Example e2;									

	static void m1(Example e3){			
		Example e4;								
	}
}

//Q7) What is the life time and scope of all above referenced variables?
	/*
	 *	Like primitive variable 
	 *		- static referenced variable 	gets memory, 
	 *				when it's enclosing class is loaded, means Sample in above program
     *
	 *		- non-static referenced variable 	gets memory,
	 *				when it's enclosing class object is created, means Sample class object in above program
	 *
	 *		- parameter referenced variable 	gets memory,
	 *				when it's enclosing method is called, means m1() is  above program object
	 *
	 *		- local referenced variable 	gest memory,
	 *				when it's enclosing method is called and its declaration statement is executed, 
	 *				means m1() is  above program object
	 */

//Below program shows allocating memory for above referenced variables
class  Test02{
	
	public static void main(String[] args) {

			System.out.println(Sample.e1);
			Sample.m1(null);
			Sample s1 = new Sample();
		
	}
}


//Q8) In JVM, where static referenced variable get memory?
	//in side MA in it enclosing class cotext
 
 //Q9) In JVM, where non-static referenced variable get memory?
 	//in side HA in it enclosing class object 
 
 //Q10)In JVM, where parameter and local referenced variables get memory?
 //in side JSA area in main thread in its enclosing method stack frame
 
 /*  Can we access SRV in all methods of current class and other class, if yes, how?
 *		- Yes, we can access
 *		- with in the same enclosing class we can access directly by its name
 *		- from other classes we can access by using its enclosing class reference
 *		- as below
 *			- System.out.println(Sample.e1); 
 *
 *  Can we access NSRV in all methods of current class and other class, if yes, how?
 *		- Yes, we can access
 *		- with in the same enclosing class SM, we must access by using its enclosing class object refence
 *		- with in the same enclosing class NSM, we can access directly by its name, then "this" is added as reference
 *		- from other classes from both SM and NSM, we must access by its using enclosing class object refence
 *		- as below
 *		-	Sample s1 = new Sample();
 *			System.out.println(s1.e2); 
 *
 *  Can we access parameter and local referenced variables  in all methods of current class and other class, if no, why?
 *		- Nooooooo, we can not access
 *		- their scope is belongs to only this current method
 *
 */
