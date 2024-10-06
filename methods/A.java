// A Java program to demonstrate
// use of abstract keyword.

// abstract class
abstract class A {
	// abstract method
	// it has no body
	abstract void m1();

	// concrete methods are still
	// allowed in abstract classes
	void m2()
	{
		System.out.println("This is "
						+ "a concrete method.");
	}
}