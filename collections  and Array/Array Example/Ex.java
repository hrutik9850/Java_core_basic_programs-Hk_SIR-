public class Ex
{
	private int x;
	private int y;
	public Ex(int x,int y){
		this.x = x;
		this.y =y;
	}
	public int getX(){
		return x;
	}
	public int setX(int x){
		this.x = x;

	}
	
	public int getY(){
		return y;
	}
	public int setY(int y){
		this.y = y;

	}
	public String  toSting(){
			return "("+y+","+x+")";
		}
}