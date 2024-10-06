class StaticObj
{
	int v1=2200;
	float v2= 4.4f;
	double v3=59.9;
	boolean v4=true;
	short v5= 300;
	long v6= 88888888888l;
	byte v7= 12;
	String v8="hrutik program";
	public static void main(String[] args) 
	{
		StaticObj obj=new StaticObj();
		System.out.println("obj used static value thay used to ");
		System.out.println(obj.v1);
		System.out.println(obj.v2);
		System.out.println(obj.v3);
		System.out.println(obj.v4);
		System.out.println(obj.v5);
		System.out.println(obj.v6);
		System.out.println(obj.v7);
		System.out.println(obj.v8);
	}
}
