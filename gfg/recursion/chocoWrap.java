package gfg.recursion;

public class chocoWrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 16;
		int price = 2;
		int wrap = 2;
		int real = money / price;
		System.out.println(choco(wrap, real, real, 0));

	}

	static int choco(int w, int curr, int real, int ans) {
		if(curr + ans < w) return real;
		if(curr - w >= 0) {
			return choco(w, curr - w, real + 1, ans + 1);
		} else {
			return choco(w, curr + ans, real, 0);
		}
	}
}
