/**Checked exception rules
========================
1. Rule on handling (reporing or catching)
     When we throw or when we recieve a checked exception 
      we must handle this checked exception 
      either by reporting or by catching  
      else compiler will throw error  
	      "unreported exception <exception class name> 
	       must be caught or declared to be thrown"

2. Rule on catching
	Without throwing or recieving a checked exception,
	we must not place catch block for catching checked exception,
	compiler will throw an error: "exception ... is never thrown 
	from the body of corresponding try statement", because 
	without throwing it by programmer a checked exception 
	is never occured at execution time.

	but we can add catch(Exception/Throwable) even though 
	they are not throwing from try block, because for catching 
	unchecked exception as backup catch blocks. 
	
	The exception classes Exception and Throwable are called as
	partially checked exceptions, because these exception classes 
	have both checked and unchecked exception classes as sub classes.

		An exception class that has both checked and unchecked 
		exceptions as sub classes is called partially checked exception.
		It is called partially checked exception because one of the rules
		of checked exceptions is not applied.

		The exception class that does not unchecked exception as 
		sub class is called fully checked exception classes. 

		The Exception and Throwable are only the partially 
		checked exception classes.
				
		Except Error, RuntimeException remaing all direct sub classes of
		Throwable and Exception classes are fully checked exceptions.

	On Throwable and Exception only this catch block rule is not applied, 
	remaining 6 rules are applied. It means when you throw 
	Exception or Throwable we must handle them.

	We cannot add catch(checked exception) without 
	throwing it from a try block, but we can add 
	throws checked exception, without throwing it 
	from the body of method. 
	
	It is allowed, because for informing to the 
	sub class programmer about the exception that is 
	allowed to throw from this method implementation logic. 

	In above case, even though the reported checked exception is
	not throwing from this method; inside the calling method 
	we must handle this checked exception, else 
	compiler will throw error. But remember we will not get 
	this exeception at execution time, because the exception is
	not thowning from the called method body.

3. Rule on overriding a method
	1) If a method in super class does not have throws checked 
	   exception, in sub class while overriding that method, 
           we must not add throws checked exception. If we add, 
	   compiler will throw error, but we can add 
	   throws unckecked exception.

	2) If super class method has throws checked exception,
	   in sub classes we can override this method
		1. either by ignoring throws exception 
		2. or only by throwing the same checked exception
		3. or only by throwing its subclasses
		4. but not by thorwing either super class or sibling or 
			or more checked exceptions
		5. but we can override by adding 
				throws unchecked exception

4. Rule on throwing diff checked exception from a overridding method
	From a overriding method, it is not possible to throw 
	diff checked exception, compiler will throw an error.
	We can only catch that checked exception.
	
	If we need to throw diff checked exception from a 
	overriding method, we can not throw it directly, here 
	we must implement "exception chaining" either by using  
	same super class overridden method throwing checked excetption 
	or by using unchecked exception RuntimeException class.

	Exception chaining means throwing an exception by wrapping it in
	another exception. If the overriden method's throwing checked exception 
	does not support exception chaining, we must use unchecked exception 
	RuntimeException class.

	If an exception class does not have Exception or Throwable parameter
	constructor, this exception class does not supprot exception chaining.

5. Rule on calling a method/constructor at class level
	If a method/constructor is reporting a checked exception,
	we can not call this method at class level and we can not 
	create object by using this constructor at class level.
	
	We must call this method and constructor only 
	inside a static block or inside a instance block or 
	inside another constructor or inside another method 
	of this class by handling this exception.

	Inside SIB and inside IIB we can handle an exception 
	only using try/catch. Inside constructor we can handle
	an exception either by using try/catch or by using throws.

6. Rule on sub class constructor
	If a super class constructor throws checked exception,
	in sub class in all constructors we must handle this 
	checked exception only by using throws keyword.

	In side sub class constructor we can not catch the 
	super class constructor throwing checked exception, 
	because super() call must be the first statement inside 
	constructor.

	Note: Inside sub class from its constructor logic
	if some other checked execeptions are throwing, 
	we can report those exceptions with ',' separated along
	with the super class constructor reporting exception,	
	because constructor is not a overriding member.

7. Rule on handling exception inside SB, IB and Constructor
	Inside a static block and instance block we can not 
	report checked exception, we can only catch exception
	because blocks are not methods, they do not have signature,
	they must be completed normally.

	Inside constructor we can report or can catch an exception,
	because constructor is a kind of method & it has signature.
	for sample code refer 6th point.
	*/