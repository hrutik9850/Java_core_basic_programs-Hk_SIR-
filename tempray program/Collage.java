class Collage 
{
	public static void main(String[] args) 
	{
		StudentFrom s1 = new StudentFrom();
		StudentFrom s2 = new StudentFrom();
		FileFrom F1 = new FileFrom();
		F1.From(s2);
		System.out.println("Collage Name:"+s1.getCollName());
		System.out.println("student Name:"+s1.getName());
		System.out.println("student PRN:"+s1.getPRN());
		System.out.println("student Age:"+s1.getAge());
		System.out.println("student Free:"+s1.getF());
		System.out.println("student Class Name:"+s1.getCN());
		s1.setName("Hrutik Dharmkar");
		s1.setPRN(23425);
		s1.setAge(22);
		s1.setF(14000.00);
		s1.setCN("MCA I");
		System.out.println("=====================================================");
		System.out.println("Collage Name:"+s1.getCollName());
		System.out.println("student Name:"+s1.getName());
		System.out.println("student PRN:"+s1.getPRN());
		System.out.println("student Age:"+s1.getAge());
		System.out.println("student Free:"+s1.getF());
		System.out.println("student Class Name:"+s1.getCN());
		System.out.println("=======================Display===========================");
		s1.Display();
		System.out.println("=======================s2Display===========================");
		s2.Display();
		
		
	}
}
