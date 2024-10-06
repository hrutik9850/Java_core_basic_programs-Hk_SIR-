// living thubg
interface LivingThing			// Interface and abstracation
{
	void move();
}
class Person implements LivingThing
{
	public void move(){
		System.out.println("person in moving by waking");	//polymorphim
	}
}
//Animal.java
class Animal implements LivingThing
{
	public void move(){
		System.out.println("Animal is moving by running");
	}
}
//Bird.java
class Bird implements LivingThing
{
	public void move(){
		System.out.println("Bird is mobing by flying ");

	}
}
//Zoo
class Zoo
{
	void allow(LivingThing lt){		// LC (super class type ref var) RP
			lt.move();				//  implementation called methods from diff implementation class
									//based on the argument object or runtime object passed	
	}
		public static void main(String []args){
			Zoo hkzoo = new Zoo();

			hkzoo.allow(new Animal());
			hkzoo.allow(new Bird());
			hkzoo.allow(new Person());
			hkzoo.allow(new Fish());
		}
	
}
//fish java
class Fish implements LivingThing
{
	public void move(){
		System.out.println("fish is moving by swinning");
	}
}