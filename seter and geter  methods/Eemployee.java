public class Eemployee  
{
	private int Eno;
	private String Ename;
	private double Sal;
public void setEno(int Eno){
	this. Eno = Eno;
}
public void setEname(String Ename){
	this.Ename = Ename;
}
public void setSal(double Sal){
	this.Sal = Sal;

}
public int getEno(){
	return Eno;
}
public String getEname(){
	return Ename;
}
public double getSal(){
return Sal;
}
public void display(){
	System.out.println("Eno"+Eno);
	System.out.println("Ename"+Ename);
	System.out.println("Sal"+Sal);
}
	
}
