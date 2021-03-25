package gfg.array;

import java.util.*;

public class WaveArr {
//	public static<T> void swap(T[] arr, int index1, int index2) {
//		List<T> list = Arrays.asList(arr);
//		Collections.swap(list, index1, index2);
//		arr = (T[]) list.toArray();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer arr[] = {1,2,3,4,5,6};
//		for(int i = 0; i < arr.length; i += 2) {
//			if(i < arr.length - 1)
//			swap(arr, i, i + 1);
//		}
////		System.out.println(Arrays.asList(arr));
//		for(int e : arr) {
//			System.out.print(e + " ");
//		}
		
		 int arr[] = {1,2,3,4,5};
		 for(int i = 0; i < arr.length; i += 2) {
			 if(i < arr.length - 1) {
				 int temp = arr[i];
				 arr[i] = arr[i + 1];
				 arr[i + 1] = temp;
			 }
			 
		 }
		 for(int e : arr) {
			 System.out.print(e + " ");
		 }
		

	}

}
