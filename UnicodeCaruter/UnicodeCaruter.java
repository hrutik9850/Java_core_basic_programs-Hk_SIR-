class Uni{
	char ss ='\u0023';
}
class UnicodeCaruter
{
	static char hd='\u0034' ;
	public static void main(String[] args) 
	{
		Uni u=new Uni();

		System.out.println(\u0030);
		System.out.println(\u0031);
/*		System.out.println('\u0041');		conver to unicodecaruter \u0041==(A)	CE:cannot find symobol
		System.out.println('\u0042');									   ==(B)
		System.out.println('\u0061');										==(a)
		System.out.println('\u0062');										==(b)
		*/
	
	System.out.println("_________________________________________");
	int a1=\u0031;
	int a2=\u0032;
	int a3=\u0033;
	int a4=\u0034;
	int a5=\u0035;
	int a6=\u0036;
	int a7=\u0037;
	int a8=\u0038;
	int a9=\u0039;
	System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5+" "+a6+" "+a7+" "+a8+" "+a9);
	System.out.println("___________________________________________________________");
	int  b1=\u0031\u0032 ;
	System.out.println(b1);
	char
		ab[]={'\u0041','\u0042','\u0043','\u0044','\u0045','\u0046','\u0047','\u0048','\u0049','\u0050','\u0051','\u0052','\u0053','\u0054'};
	//	CE:-cannot find symbol
	System.out.println(ab.length);
	//int le=ab.length;
	UnicodeCaruter ob=new UnicodeCaruter();
	for (int i=0;i<=ab.length;i++)
	{
		System.out.println(ab[i]);
	}
	System.out.println("_____________________________________________________________________________");

	char c1='\u0041';
	char c2='\u0042';
	char c3='\u0043';
	char c4='\u0044';
	char c5='\u0045';
	char c6='\u0046';
	char c7='\u0047';
	char c8='\u0048';
	char c9='\u0049';
	char c10='\u0050';
	//char c10='\u0046';
	char c11='\u0051';
	char c12='\u0052';
	char c13='\u0053';
	char c14='\u0054';
	char c15='\u0055';
	char c16='\u0056';
	char c17='\u0057';
	char c18='\u0058';
	char c19='\u0059';
	char c20='\u0060';
	char c21='\u0061';
	char c22='\u0062';
	char c23='\u0063';
	char c24='\u0064';

	
	System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5+" "+c6+" "+c7+" "+c8+" "+c9+" "+c10+" "+c11+" "+c12);
	System.out.println(c13+" "+c14+" "+c15+" "+c16+" "+c17+" "+c18+" "+c19+" "+c20+" "+c21+" "+c22+" "+c23);
	System.out.println(u.ss);
	System.out.println(hd);
	System.out.println("______________________________________________");
	int \u0061='\u0062' ;
	System.out.println(a);
	
	

	}
}
