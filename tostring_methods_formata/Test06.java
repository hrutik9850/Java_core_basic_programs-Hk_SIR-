/*how can we display array object data
By using predefine class Arrays
toSting() method 


*/
import java.util.Arrays;
class Test06 
{
	public static void main(String[] args) 
	{	int[] ia ={ 4,5,3,5,5};
		System.out.println(ia);					//[I@2f92e0f4
		System.out.println(ia.toString());		//[I@2f92e0f4
		System.out.println(Arrays.toString(ia));//[4 5 3 5 5]
	}
}
