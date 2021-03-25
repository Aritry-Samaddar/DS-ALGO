package arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {23, 7, 9, 5, 2, 29, 15, 19, 31};
		int n = a.length;
		for(int gap = n / 2; gap > 0; gap /= 2) {
			for(int j = gap; j < n; j++) {
				for(int i = j - gap; i >= 0; i -= gap) {
					if(a[i + gap] > a[i]) {
						break;
					} else {
						int temp = a[i + gap];
						a[i + gap] = a[i];
						a[i] = temp;
					}
				}
			}
		}
		for(int e : a) {
			System.out.print(e + " ");
		}

	}

}
