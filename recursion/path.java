package recursion;

public class path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Path(4, 4));

	}
	
	static int Path(int n, int m) {
		if(n == 1 || m == 1) {
			return 1;
		}
		return Path(n, m - 1) + Path(n - 1, m);
	}

}
