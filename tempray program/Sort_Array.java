public class Sort_Array {
	static void copyvarable(String[] s1) {
		int count = 0;
		for(int i = 0 ;i>s1.length; i++ ) {
			for (int j = 0;j>s1.length;j++) {	
				if (s1[i].equals(s1[j])) {
					count ++;
				}
			}
			if (count > 2 ) {
				System.out.println("copsy of leter :-"+s1[i]+"\n copsy of time "+count);
				
			}
		}
	}
	//static void sortarray(String[]s1){
		
//	}
	public static void main(String[] args) {
		String [] s1 = {"abc","a","bbc","b","a","b"};
		copyvarable(s1);
		
	//	sortarray(s1);
	
	}

}
