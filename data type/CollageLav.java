class CollageLav 
{
	public static void main(String[] args) 
	{
		LabRume.Collage="S.K.collage";
		LabRume.D1="BCA";
		LabRume.CollageCode=229;
		LabRume.LabId="Lb00034";
		LabRume ob=new LabRume();
		ob.Sname="hrutik Dharamkr";
		ob.y1=1;
		ob.Bookname="java";
		System.out.println("collage name:\t\t"+ob.Collage);
		System.out.print("Depart ment:\t\t"+ob.D1);
		System.out.println(ob.y1);
		System.out.println("collage code:\t\t"+ob.CollageCode);
		System.out.println("collage lab Id:\t\t"+ob.LabId);
		System.out.println("collage student name:\t"+ob.Sname);
		System.out.println(" collage lab bookname:\t"+ob.Bookname);
		System.out.println("----------------------------------------------------------");
		LabRume s1 = new LabRume();
		System.out.println("collage name:\t\t"+s1.Collage);
		System.out.print("Depart ment:\t\t"+s1.D1);
		System.out.println(s1.y1);
		System.out.println("collage code:\t\t"+s1.CollageCode);
		System.out.println("collage lab Id:\t\t"+s1.LabId);
		System.out.println("collage student name:\t"+s1.Sname);
		System.out.println(" collage lab bookname:\t"+s1.Bookname);
	}
}
