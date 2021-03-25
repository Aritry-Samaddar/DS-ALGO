package tcs;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 1;
		int r = 10;
		int count = 0;
		for(int i = l; i <= r; i++) {
			if(i % 2 != 0 && i < 5) {
				boolean isPrime = true;
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if(i < 2) isPrime = false;
				if(isPrime == true) count++;
			}
		}
		System.out.println(count);
		

	}

}
