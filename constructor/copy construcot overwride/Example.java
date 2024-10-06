/*
- Defining multipl constructors with different parameter types or list or order
is called constructor overloading
*/
class Example 
{
	int x ;
	int y ;
	 
	 Example(){
		x = 10;
		y = 20;
	 }
	 Example(int x, int y){
		this.x = x;
		this.y = y;
	 }
	 Example(Example e){
		this.x = e.x;
		this.y = e.y;
	 }
	 Example(double x, double y ){
		this.x =(int) x;
		this.y =(int) y;
	 }
	void Displa(){
		System.out.println(x+ "  " + y);
	}
}
/*
- when we overload constructor, the constructor is executed based on the argument 
we pass. Whne we call one constructor other constructors are not executed, only 
the invoked constructor is executed based on the argument types we passed.
*/

