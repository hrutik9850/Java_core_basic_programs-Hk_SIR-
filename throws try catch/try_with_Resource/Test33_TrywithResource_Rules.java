import java.io.*;
import java.sql.*;
class Test33_TrywithResource_Rules 
{
	public static void main(String[] args) 
	{
		//Rule #1 the resource's variable and object
			//both must be AutoCloseble type
			try(PrintStream ps = new PrintStream(System.out)){
				ps.println("Hello");
			}
		//	try(String s = "a"){
				
		//	}
		//	try(Object obj = new PrintStream(System.out)){
				
		//	}
	//		try(AutoCloseable ac = new PrintStream(System.out)){
		//	}
				
	}
}
