class ArrayIncrement{

	Object[]  ary  = new  Object[5]; 
	int elements = 0;


public void add(Object obj){
	if ( elements == ary.length){
		this.sizeIncrement();
	}
	ary[elements] = obj ;
	elements++;

}
public  void sizeIncrement(){
	int newarraylent = ary.length*2;
	Object[] newarray = new Object[newarraylent];
	for( int i =0; i< ary.length;i++){
		newarray[i]  = ary[i];	
	}
	ary = newarray;
}

	public static void main (String []args){
	
	ArrayIncrement arrayIncrement  = new ArrayIncrement();
		arrayIncrement.add(99);
		arrayIncrement.add(89);
		arrayIncrement.add(59);
		arrayIncrement.add(9);
		arrayIncrement.add(9);
		arrayIncrement.add(94);
		arrayIncrement.add(19);
		arrayIncrement.add(95);
	System.out.println( " add all element  more thean 5 size ");

	}
}