public class NITCollecationTest
{
	public static void main(String[]args){
		NITcollecation col = new NITcollecation();
		System.out.println("capacity:"+col.capacity());
		System.out.println(" Size :"+col.size());
		System.out.println("eles :"+ col);
		System.out.println();
		col.add("a");
		col.add("b");
		col.add(4.4);
		col.add(34);
		col.add("did");
		col.add(new Ex (43,4));
		col.add("a");
		System.out.println("Eles :"+ col );
		System.out.println("size :"+ col.size());
		System.out.println("capacity:"+ col.capacity());
		System.out.println();

		col.add(4.5);
		System.out.println("Eles :"+ col );
		System.out.println("size :"+ col.size());
		System.out.println("capacity:"+ col.capacity());
		System.out.println();


	}
} 