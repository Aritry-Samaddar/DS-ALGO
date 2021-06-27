package maventic;

public class evenodd {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 4, 1, 6, 3, 8, 7};
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if(arr[i] % 2 == 0) {
				i++;
			} else {
				if(arr[j] % 2 == 0) {
					swap(arr, i, j);
					i++;
					j--;
				}
				j--;
			}
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		
	}

}
