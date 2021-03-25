package projects;

public class ArrayPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 3, 5, 6, 2};
		int n = a.length;
		for(int i = 0; i < n; i++) {
			a[i] = 1;
			for(int j = 0; j < n; j++) {
				a[i] *= a[j];
			}
			System.out.print(a[i] + " ");
		}

	}

}
