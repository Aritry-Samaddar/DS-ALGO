package final450.array;

import java.util.Arrays;

public class MergeArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2, 6, 7, 8, 9, 9, 10, 10, 11, 12, 12, 12, 12, 13, 13, 13, 14, 15, 16, 16, 17, 18, 18, 19, 20};
		int arr2[] = {1, 5, 5, 7, 7, 8, 9, 11, 15, 18, 18, 18, 20, 20};
		int n = 25;
		int m = 14;
		
//		int l = n + m;
//		int arr3[] = new int[l];
//		int pos = 0;
//        for(int e1 : arr1) {
//			arr3[pos] = e1;
//			pos++;
//		}
//		for(int e2 : arr2) {
//			arr3[pos] = e2;
//			pos++;
//		}
//		Arrays.sort(arr3);
//		for(int i = 0; i < n; i++) {
//		    arr1[i] = arr3[i];
//		}
//		for(int j = 0; j < m; j++) {
//		    arr2[j] = arr3[j + n];
//		}
		
		
		
		
		
		
		
		
		
		
		
		int l = n + m;
		int arr3[] = new int[l];
		int pos = 0;
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int count = 0;
		
		
		
		if(n > m) {
			int temp = n;
			n = m;
			m = temp;
			
			int temp1[] = arr1;
			arr1 = arr2;
			arr2 = temp1;
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr1[i] > arr2[j]) {
					int t = arr1[i];
					arr1[i] = arr2[j];
					arr2[j] = t;
				} else if(arr1[i] < arr2[j]) {
					continue;
				}
			}
		}
		Arrays.sort(arr2);
		
		
		
		
		
		
		
		
		
		
		
//		while(i < n) {
//			if(arr1[i] < arr2[j]) {
//				i++;
//				k++;
//			} else if(arr1[i] > arr2[j]) {
//				int temp = arr1[i];
//				arr1[i] = arr2[j];
//				arr2[j] = temp;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		while(k < l) {
//			if(i < n && j < m && arr1[i] > arr2[j]) {
//				arr3[k] = arr2[j];
//				k++;
//				j++;
//			} else if(i < n && j < m && arr1[i] < arr2[j]) {
//				arr3[k] = arr1[i];
//				k++;
//				i++;
//			} else if(i < n && j < m && arr1[i] == arr2[j]) {
//				arr3[k] = arr1[i];
//				k++;
//				i++;
//				arr3[k] = arr2[j];
//				k++;
//				j++;
//			} else if(i >= n && j < m) {
//				arr3[k] = arr2[j];
//				if(k != l - 1)
//				k++;
//				j++;
//			}
//		}
//		for(int e : arr3) {
//			System.out.print(e + " ");
//		}
		
		
		for(int e1 : arr1) {
			arr3[pos] = e1;
			pos++;
		}
		for(int e2 : arr2) {
			arr3[pos] = e2;
			pos++;
		}
//		Arrays.sort(arr3);
		for(int e : arr3) {
			System.out.print(e + " ");
		}
	}

}
