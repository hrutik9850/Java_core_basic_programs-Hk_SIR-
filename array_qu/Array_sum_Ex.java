
// >>>>how to write a program without using the loop and  conditioner statement   calculate the total sum of  all elements

public class Array_sum_Ex 
{
	public static int calculate_sum( int[] array ,int index){
		if (index == array.length)
		{
			return 0;
		}
		return array[index] + calculate_sum(array, index +1);
		
	}
	public static void main(String[] args) 
	{
		int [] arr_int = {10,20,30, 40, 50,};
		int index = 0;
		 int total_array_sum = calculate_sum(arr_int, index);

		 System.out.println("total sum of array :" + total_array_sum);
	}
}
