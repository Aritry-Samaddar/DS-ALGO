package gfg.recursion;

public class more1Prefixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRec("", 0, 5);

	}
	
	static void printRec(String number, int extraOnes, int remainingPlaces) {
		if(0 == remainingPlaces) {
			System.out.println(number + " ");
			return;
		}
		printRec(number + "1", extraOnes + 1, remainingPlaces - 1);
		if(0 < extraOnes) printRec(number + "0", extraOnes - 1, remainingPlaces - 1);
	}

}
