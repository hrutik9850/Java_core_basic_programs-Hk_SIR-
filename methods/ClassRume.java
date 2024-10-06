class ClassRume 
{
	int eng = 60;
	int sci = 65;
	int hin = 89;
	int mar = 90;
	int scol = 58;
	int sub = 6;
	int a;
	 int totle(){
		a = eng + sci + hin + mar + scol;
		return a ;
	}
	 double pur(){
		double p = a / sub ;
		return p ;
	}
}
