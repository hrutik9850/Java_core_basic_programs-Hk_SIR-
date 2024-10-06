class Room 
{
	private double l ;
	private double b;
	public void setL(double l){
		this.l = l;

	}
	public void setB(double b){
		this.b = b;

	}
	public double getL(){
		return l;

	}
	public double getB(){
		return b;
	}
	public void findArea(){
		System.out.println("area"+l*b);
	}
	public void findPerimeter(){
		System.out.println("findPerimeter:"+2*(l+b));
	}
	public void display(){
		System.out.println("l:"+l);
		System.out.println("b:"+b);
	}
}
