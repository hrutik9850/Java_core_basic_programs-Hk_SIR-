class Example  
{
	int x ;
	int y ;

	Example(){
		x = 10;
		y = 20;
	
	}
	Example(int x, int y ){
		this.x = x;
		this.y = y;
		
	}
	Example(Example e){
		this.x = e.x;		//copy constructor
		this.y = e.y;
	}
	void Display(){
		System.out.println(x + "  "+y);
	}
}
