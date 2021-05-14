package gfg.recursion;

public class recProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(product(2, 5));

	}
	
	static int product(int x, int y) {
		if(x < y) {
			return product(y, x);
		}
		else if(y != 0) {
			return x + product(x, y - 1);
		}
		else {
			return 0;
		}
	}

}
