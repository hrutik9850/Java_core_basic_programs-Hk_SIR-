public class Voter
{
	private int age;
	private String name;
	public void setAge(int age)throws IllegalArgumentException{
	if (age <18 || >120)
		throw now IllegalArgumentException("you are not eligible for voting");
	{
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}

	
}
