package maventic;

import java.util.*;

public class evenoddele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) even.add(arr[i]);
			else odd.add(arr[i]);
		}
		System.out.println(even);
		System.out.println(odd);
		
		QuickSort(even, 0, even.size() - 1);
		QuickSort(odd, 0, odd.size() - 1);
		
		for(int e : even) System.out.print(e + " ");
		for(int e : odd) System.out.print(e + " ");
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
			if(al.get(j) > pivot) {
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
