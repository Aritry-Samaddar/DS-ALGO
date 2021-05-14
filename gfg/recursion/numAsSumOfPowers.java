package gfg.recursion;

public class numAsSumOfPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = (int) Math.cbrt(100);
//		System.out.println(a);
//		int pow = (int)Math.pow((double)100, (double)1/3);
//		System.out.println(pow);
//		System.out.println((double)1/3);
		fun(100, 2, 0, 0, 1);

	}

	static void fun(int x, int n, int sum, int count, int j) {
//		if(j > (int)Math.pow((double)x, (double)1/n)) return;
		if(sum == x) {
			count += 1;
			System.out.println(count);
			return;
		}
		for(int i = j; i <= (int)Math.pow((double)x, (double)1/n); i++) {
			sum += (int)Math.pow(i, n);
			fun(x, n, sum, count, i + 1);
			sum -= (int)Math.pow(i, n);
		}
	}
	
}
