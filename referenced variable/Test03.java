 //Q11) the object assigned to a either of the above 4 variables, inside JVM where that object is created?
	 //always objects are created only in heap area.
	 //but thier referenced variables are created either in MA or HA or in JSA
	 //depending the place theye created in the class as static or non-static 
	 //in method as parameter and local referenced variable.
	 
//Belop program shows above points with JVM architecture
class Example{
	int x;
	int y;
}

class Sample{
	static Example e1 = new Example();							
	Example e2 = new Example();									

	void m1(Example e3){			
		Example e4 = new Example();								
	}
}

class  Test03{
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.m1(new Example());
	}
}
