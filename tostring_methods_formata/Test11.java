
	class B{
		int x;
		B(int p){
			x = p;
		}
	}
import java.util.Arrays;
	class Test11 {
		public static void main(String[] args){
			String[]	sa = {"HK", "NiT", "Hyd"};
			B[]		ba = {new B(5), new B(6); new B(7) };
			A[]		aa = {new A(5), new A(6); new A(7) };

			System.out.println(Arrays.toString(sa));//	 [HK, NiT, Hyd]
			System.out.println(Arrays.toString(ba));//	 [B@hc1, B@hc2, B@hc3]
			System.out.println(Arrays.toString(aa));//	 [5, 6, 7]
		}
	}	