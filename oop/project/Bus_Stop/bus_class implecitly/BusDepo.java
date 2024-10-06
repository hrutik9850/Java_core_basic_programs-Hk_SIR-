//Vehicle.java
//abstraction  
//(full abstraction)
interface Vehicle{
   void engine();
   void breaks();
} 


//inheriatance + ploymorphism + encapsulation
//full implementation
class RedBus extends Bus{
	static {
		System.out.println("RedBus SB");
	}
	RedBus(){
		System.out.println("RedBus constructor");
	}
	@Override
	public void engine(){
		System.out.println("RB engine capacity 40KMPH");
	}
}

//inheritance + polymorphism + encapsulation
//full impelemenation
class Volvo extends Bus{
	@Override
	public void engine(){
		System.out.println("Volvo engine capacity 110 KMPH");
	}

	@Override
	public void breaks(){
		System.out.println("Volvo needs powerful beaks");
	}
}



//abstraction + inheritance + polymorphism + encapsulation 
//(partial abstraction)
abstract class  Bus implements Vehicle {
	@Override
	public void breaks(){
         System.out.println("Bus has normal breaks");
	}
}





//LC and RP
class Driver{
					//Loose Coupling
	void drive(Vehicle v) {
		//Runtime Polymorphism
		v.engine();
		v.breaks();
	}
}
class BusDepo {
	public static void main(String[] args) {
		Driver hk = new Driver();
		hk.drive( new RedBus() );			//TC
		//hk.drive( new Volvo() );			//TC

		//hk.drive( ??? );	//How can we make LC?
					
		
	}
}
//above code is static nature 
	//Because it always works with only one sub class
	//if we want to change to another sub class, we must
	//modify source code and recompile.

	//We must read sub class name from KB/file/DB
	//We must use Scanner API for reading class name from KB
	//Load and instantiate it dynamically by using Reflection API
	//Type cast it to its super type then pass it as argumnet to drive method
	//as shown below




//to make this class 100% dynamic, we must read sub class 
//name from keyboard and create its object dynamically 
//by using Scanner and Reflection API