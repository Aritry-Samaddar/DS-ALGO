package maventic;

import java.util.*;

public class evenOddPosSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		int[] arr = {1, 5, 3, 2, 8, 2, 0};
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) even.add(arr[i]);
			else odd.add(arr[i]);
		}
		
		QuickSort(even, 0, even.size() - 1);
		QuickSort(odd, 0, odd.size() - 1);
		
		System.out.println(even);
		System.out.println(odd);
		
		if(even.size() >= odd.size()) {
			for(int i = 0; i < even.size(); i++) {
				System.out.print(even.get(i) + " ");
				if(i < odd.size()) System.out.print(odd.get(i) + " ");
			}
		} else {
			for(int i = 0; i < odd.size(); i++) {
				if(i < even.size()) System.out.print(even.get(i) + " ");
				System.out.print(odd.get(i) + " ");
			}
		}
		
	}

	static void swap(ArrayList<Integer> al, int i, int j) {
		int temp = al.get(i);
		al.set(i, al.get(j));
		al.set(j, temp);
	}
	
	static int partitions(ArrayList<Integer> al, int low, int high) {
		int pivot = al.get(high);
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if(al.get(j) < pivot) {
				i++;
				swap(al, i, j);
			}
		}
		swap(al, i + 1, high);
		return i + 1;
	}
	
	static void QuickSort(ArrayList<Integer> al, int low, int high) {
		if(low < high) {
			int pos = partitions(al, low, high);
			QuickSort(al, low, pos - 1);
			QuickSort(al, pos + 1, high);
		}
	}
}
