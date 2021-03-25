package lists.arrayLists;

public class Pair<X, Y> {     // Pair  /////////////Pair<> defines generics type
	X x;                      // String x;
	Y y;                      // int y;
	
	public Pair(X x, Y y) {   // Pair(String x, int y)
		this.x = x;
		this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x + " and " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
