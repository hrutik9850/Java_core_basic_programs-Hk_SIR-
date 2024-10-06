
class Collage  
{
	public static void main(String[] args)
	{
		Student sl = new Student();

		sl.sno = Integer.parseInt(args[0]);			//commind line orgument
		sl.sname = args[1];
		sl.couse = args[2];
		sl.fee =Double.parseDouble(args[3]);
		sl.email =args[4];
		sl.Mno =Long.parseLong(args[5]);
		sl.gender = args[6].charAt(0);
		sl.stunyin = Boolean.parseBoolean(args[7]);
		System.out.println("sno"+sl.sno);
		System.out.println("sname"+sl.sname);
		System.out.println("fee"+sl.fee);
		System.out.println("email"+sl.email);
		System.out.println("Mno"+sl.Mno);
		System.out.println("grnder"+sl.gender);
		System.out.println("studyin"+sl.stunyin);

	}
}
