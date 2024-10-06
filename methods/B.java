
// concrete class B
class B extends A {
	// class B must override m1() method
	// otherwise, compile-time
	// exception will be thrown
	void m1()
	{
		System.out.println("B's "
						+ "implementation of m1.");
	}
}
