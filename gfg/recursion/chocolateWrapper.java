package gfg.recursion;

public class chocolateWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun1(15, 1, 3));

	}
	static int fun1(int money, int price, int wrapper) {
		int choco = money / price;
		return choco + fun(choco, wrapper);
	}

	static int fun(int choco, int wrapper) {
		if(choco < wrapper) return 0;
		int newChoco = choco / wrapper;
		return newChoco + fun(newChoco + choco % wrapper, wrapper);
	}
}
/*An efficient solution is to use a direct formula to find the number of chocolates. 

Find initial number of chocolates by
dividing the amount with per piece cost.
i.e. choc = money / price

then apply below formula
choc += (choc - 1)/(wrap - 1)*/