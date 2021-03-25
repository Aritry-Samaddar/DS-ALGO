package final450.array;

import java.util.Arrays;

import projects.TwoPointer;

public class Six {
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
	
	void printUnion(int arr1[], int n, int arr2[], int m) {
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
		for(int i = 0; i < m; i++) {
			if(binarySearch(arr1, 0, n - 1, arr2[i]) == -1) {
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
//		int[] b = {1, 4, 2, 3, 5, 4};
//		Arrays.sort(a);
//		Arrays.sort(b);
//		int n = 2;
//		int m = 6;
//		int sum = 0;
//		int p = 0;
//		int q = 1;
//		int x = 0;
//		int y = 1;
//		int i = 0;
//		int j = 0;
//		int count = 0;
//		int count2 = 0;
//		int count3 = 0;
//		while(q < n) {
//			int temp = a[p];
//			if(temp == a[q]) {
//				count2 += 1;
//				p++;
//				q++;
//			} else {
//				p++;
//				q++;
//			}
//		}
//		while(y < m) {
//			int temp = b[x];
//			if(temp == b[y]) {
//				count3 += 1;
//				x++;
//				y++;
//			} else {
//				x++;
//				y++;
//			}
//		}
//		while(i < n && j < m) {
//			if(a[i] > b[j]) {
//				j++;
//			} else if(a[i] < b[j]) {
//				i++;
//			} else {
//				count += 1;
//				i++;
//				j++;
//			}
//		}
//		sum = (n - count2) + ((m - count3) - count);
//		System.out.println(sum);
		
		
		
		Six obj = new Six();
		int[] arr1 = { 7, 1, 5, 2, 3, 6 };
		int[] arr2 = { 3, 8, 6, 20, 7 };
		int n = arr1.length;
		int m = arr2.length;
		System.out.println("Union of two arrays : ");
		obj.printUnion(arr1, n, arr2, m);
		System.out.println();
		System.out.println("Insertion of two arrays : ");
		obj.printInsertion(arr1, n, arr2, m);
		
		
	}

}
