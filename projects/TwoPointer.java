package projects;

import java.util.Arrays;

public class TwoPointer {
	void printInsertion(int arr1[], int n, int arr2[], int m) {
		if(n > m) {
			int temp[] = arr1;
			arr1 = arr2;
			arr2 = temp;
			
			int tempp = n;
			n = m;
			m = tempp;
		}
		Arrays.sort(arr1);
		for(int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < m; i++) {
			if(binarySearch(arr1, 0, n - 1, arr2[i]) != -1) {
				System.out.print(arr2[i] + " ");
			}
		}
	}
	
	int binarySearch(int arr[], int x, int y, int z) {
		if(y >= x) {
			int mid = x + (y - x) / 2;
			if(arr[mid] == z) {
				return mid;
			}
			if(arr[mid] > z) {
				return binarySearch(arr, x, mid - 1, z);
			}
			if(arr[mid] < z) {
				return binarySearch(arr, mid + 1, y, z);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {4, 4};
//		int[] b = {1, 2, 3, 4, 4, 5};
//		int n = a.length;
//		int m = b.length;
//		Arrays.sort(a);
//		Arrays.sort(b);
//		int i = n - 1;
//		int j = m - 1;
//		int count = 0;
//		while(i >= 0 && j >= 0) {
//			if(a[i] > b[j]) {
//				i--;
//			} else if(a[i] < b[j]) {
//				j--;
//			} else if(a[i] == b[j]){
//				count += 1;
//				i--;
//				j--;
//			}
//		}
//		System.out.println(count);
		
//		Arrays.sort(a);
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < m; j++) {
//				
//			}
//		}
		
		TwoPointer obj = new TwoPointer();
		int[] arr1 = { 7, 1, 5, 2, 3, 6 };
		int[] arr2 = { 3, 8, 6, 20, 7 };
		int n = arr1.length;
		int m = arr2.length;
		System.out.println("Insertion of two arrays : ");
		obj.printInsertion(arr1, n, arr2, m);
		
		

	}

}


//int count = 0;
//for(int i = 0; i < n; i++) {
//    for(int j = 0; j < m; j++) {
//        if(a[i] == b[j]) {
//            count += 1;
//        }
//    }
//}