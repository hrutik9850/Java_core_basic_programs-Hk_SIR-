class StudentFrom 
{	
	static String			 CollN ;
		   String			 StName;
		   int				 PRN;
		   int				 Age;
		   double			 Free;
		   String			 ClassName;
	static {
		CollN = "S K Collage";
	}
	void setName(String StName){
		this.StName = StName;	
	}
	void setPRN(int PRN){
		this.PRN = PRN;
	}
	void setAge(int Age){
		this.Age = Age;
	}
	void setF(double Free){
		this.Free = Free;
	}
	void setCN(String ClassName){
		this.ClassName = ClassName;
	}
	String getCollName(){
		return CollN;
	}
	String getName(){
		return StName;
	}
	int getPRN(){
	return PRN;
	}
	int getAge(){
		return Age;
	}
	double getF(){
		return Free;
	}
	String getCN(){
		return ClassName;
	}
	void Display(){
		System.out.println("Collage name:"+CollN);
		System.out.println("Student Name:"+StName);
		System.out.println("Student PRN:"+PRN);
		System.out.println("Student Age:"+Age);
		System.out.println("Student Free:"+Free);
		System.out.println("Student Name:"+ClassName);
	}

	
}
