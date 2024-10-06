class Test02
{
	int x = 10;
	int y = 20;
		public String toString(){
			return x+"    "+y;
		}
	public static void main(String[] args) 
	{
		Test02 t1 = new Test02();
		System.out.println(t1);			//10	20 
	}
}
// if we want to displey object data or some othe 
//infromation we must override toSting() mentod int ourt class as below 
