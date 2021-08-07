package arrays;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {9, 4, 7, 6, 3, 1, 5};
		MergeSort(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	
	static void MergeSort(int[] a, int l, int r) {
		if(l < r) {
			int mid = (l + r) / 2;
			MergeSort(a, l, mid);
			MergeSort(a, mid + 1, r);
			merge(a, l, mid, r);
		}
	}
	
	static void merge(int[] a, int l, int mid, int r) {
//		int[] b = new int[a.length];
//		int i = l;
//		int j = mid + 1;
//		int k = l;
//		while(i <= mid && j <= r) {
//			if(a[i] < a[j]) {
//				b[k] = a[i];
//				i++;
//			} else {
//				b[k] = a[j];
//				j++;
//			}
//			k++;
//		}
//		if(i > mid) {
//			while(j <= r) {
//				b[k] = a[j];
//				k++;
//				j++;
//			}
//		} else {
//			while(i <= mid) {
//				b[k] = a[i];
//				k++;
//				i++;
//			}
//		}
//		for(int n = l; n < r; n++) {
//			a[n] = b[n];
//		}
		
		
		
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int[] b = new int[n1];
		int[] c = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			b[i] = a[l + i];
		}
		for(int i = 0; i < n2; i++) {
			c[i] = a[mid + 1 + i];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i < n1 && j < n2) {
			if(b[i] < c[j]) {
				a[k] = b[i];
				k++; i++;
			} else {
				a[k] = c[j];
				k++; j++;
			}
		}
		
		while(i < n1) {
			a[k] = b[i];
			k++; i++;
		}
		while(j < n2) {
			a[k] = c[j];
			k++; j++;
		}
	}
}
