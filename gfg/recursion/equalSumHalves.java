package gfg.recursion;

public class equalSumHalves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		halves(5, "", "", 0);

	}
	
	static void halves(int n, String left, String right, int di) {
		if(n == 0) {
			if(di == 0)
			    System.out.println(left + right + " ");
			return;
		}
		if(n == 1) {
			if(di == 0) {
				System.out.println(left + "0" + right + " ");
				System.out.println(left + "1" + right + " ");
			}
			return;
		}
		if(2 * Math.abs(di) <= n) {
			halves(n - 2, left + "0", right + "0", di);
			halves(n - 2, left + "0", right + "1", di - 1);
			halves(n - 2, left + "1", right + "0", di + 1);
			halves(n - 2, left + "1", right + "1", di);
		}
	}

}
