// shadowing
class Local_Variable_Parameter_both_have_same_name
{
	static int a =10;
	static int b= 20;
	public static void main(String[] args) 
	{

		System.out.println(a);
		System.out.println(b);
		int a = 50;						//modifay the static vareable in mm
		System.out.println("it is a value in MM :"+a);
		System.out.println(Local_Variable_Parameter_both_have_same_name.a);
		System.out.println(Local_Variable_Parameter_both_have_same_name.a);
	}
}
/* note: we can addess static variables with class name even though there is no local varibal by static 
variable name. but it is optional.
*/