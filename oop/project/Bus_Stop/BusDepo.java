// Vehical.java
//abstraction
//(full abstraction)
interface Vehical
{
	void engine();
	void breaks();
}

abstract class Bus implements Vehical		// abstraction  ineritance   polymorphim
{
	@Override
		public void breaks(){
			System.out.println("Bus has normal breaks");
		}
}
// we have create bus by using abstract  class because one of the operation engine() inheration
// from vehical can not be implements because
// Its implemention will be changed from one type of bus to anothen type of bus
//Because bus class contains bath concret e method breaks ()and abstract metnod breaks ()and 
//abstract metnods engine(), we must declare Bus class as abstreact class

// massage passing 
//passing sub type object as arguments to super class type to a super class method class type ref to a suer class 
//method is called massage passing




// inheriatance   ploymorphim   encapsulation
// full implementation
class RedBus extends Bus
{
	
	@Override
		public void engine(){
			System.out.println("RB engin capacity 40kmph");
		}
}
//We have created RedBus by using 
//concrete class because all operations
//of Vehicle object are implemented in this class
//as per this sub type RedBus requirement


//inheritance polymorhism  encapsulation
// full implemenation
class Volvo extends Bus
{
	@Override
		public void breaks(){
			System.out.println("Volov needs powerful beals");

		}
		@Override
	public void engine(){
		System.out.println("Volvo engine capacity 110 KMPH");
	}
}
//In Volvo class we have overridden breaks() method
//because Volvo needs more powerful breaks



class DRiver 
{
	void drive(Vehical v){		//LC and RP
							// Runtime polymorphim
		v.engine();
		v.breaks();

	}
}
//Message passing 
	//-> passing sub type object as argument to super class type ref var to a user class method
	//is called message passing
class BusDepo
{
	public static void main(String[]ags){
		DRiver hk = new DRiver();
		//hk.drive( new RedBus() ); //Message passing
		hk.drive( new Volvo());
		//hk.drive( new SL() );
	}
}
//1. Abstaction => your must visualize interface with abstarct methods

//2. Inheritance => you must visualize abstract class/concrete class/final class 
				//as sub types with extends or implements keywords

//3. Encapusltion=> you must visualize abstract class/concrete class/final class 
				//with their fieds declared them as private and provide their access 
				//via the abstract methods declared inside the interface 

//4. Polymorphism=> you must visualize super class or super interface method
				//overriding or implementing in sub class or implementation class

//5. Loose Coupling => you must visualize user class with super class type ref var
				//either as paramter or local variable to accept sub class or implementation class
				//objects as arugment or values.

//6. Runtime polymorphsim=> you must visualize user class invoking super class methods 
                //with super class type ref var for executing them from diff sub classes 
				//based on the sub class object passed as arugment
				
//7. Message passing=> you must visualize main method class called user class method
				//passing sub class or implementation class objects as arugment



//This project is not 100% Loosely coupled
//becasue we must modify BusDepo class code
//every time when we need to change one 
//sub class to another sub class object.

//to make this BusDepo class also loosely coupled
//with sub types, we must read sub types names (classnames)  
//either from keyboard or from properties file or from
//xml file, then we must load sub type class byte code
//into JVM and must create its object dynamically 
//by using Reflection API, as shown in the next chapter.

//javac BusDemo.java
//	|-> BusDemo.class
//	|-> Driver.class
//	|-> Vehicle.class
//	|-> RedBus.class
//	|-> Bus.class

//java BusDemo
//	|->	RB engine capacity 40KMPH
//	|->	Bus has normal breaks

//java BusDemo
//	|->	Volvo engine capacity 110 KMPH
//	|->
