package arrays;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
		QuickSort(arr, 0, arr.length - 1);
		for(int e : arr) System.out.print(e + " ");
	}

	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partitions(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}
	
	static void QuickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pos = partitions(arr, low, high);
			QuickSort(arr, low, pos - 1);
			QuickSort(arr, pos + 1, high);
		}
	}
}
