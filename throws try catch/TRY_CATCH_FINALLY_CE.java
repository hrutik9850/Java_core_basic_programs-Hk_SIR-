class TRY_CATCH_FINALLY_CE 
{
	public static void main(String[] args) 
	{
//cace#1
		try{}
		catch(Exception e){}
		finally{}

//case#2
		try{}
		finally{}
//case#3
		try{}
		finally{}
		//catch(){}		//CEillegal start of type
		
//case#4
		//try{}			//CE:'try' without 'catch', 'finally' or resource declarations
	
// case#5
		//catch(){}		//CE:'catch' without 'try'

//case#6
		//finally{}		//CCE:'finally' without '

//case#7
		//try{}		//CE:'try' without 'catch', 'finally' or resource declarations
		int a = 10;
		//catch(Exception e){}		//CE:'catch' without 'try'
		int b = 20;
		//finally{}					//CCE:'finally' without '



	}
}
