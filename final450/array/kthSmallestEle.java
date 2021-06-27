package final450.array;

import java.util.*;

public class kthSmallestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> mh = new PriorityQueue<>(Collections.reverseOrder());
		
//		maxHeap maxheap = new maxHeap();
//		int[] arr = {7, 10, 4, 3, 20, 15};
//		int k = 3;
//		
//		for(int i = 0; i < arr.length; i++) {
//			maxheap.add(arr[i]);
//			if(maxheap.size() > k) maxheap.remove();
//		}
//		
//		System.out.println(maxheap.remove());
		
		
		int[] arr = {7, 10, 4, 3, 20, 15};
		int k = 3;
		
		for(int i = 0; i < arr.length; i++) {
			mh.add(arr[i]);
			if(mh.size() > k) mh.remove();
		}
		
		System.out.println(mh.remove());
	}
	
	

}

class maxHeap {
	private ArrayList<Integer> al = new ArrayList<>();
	
	public int size() {
		return al.size();
	}
	
	public void swap(int i, int j) {
		int temp = al.get(i);
		al.set(i, al.get(j));
		al.set(j, temp);
	}
	
	public int peek(int i) {
		if(al.size() == 0) return -1;
		return al.get(0);
	}
	
	public void add(int e) {
		al.add(e);
		upHeapify(al.size() - 1);
	}
	
	public void upHeapify(int i) {
		if(i == 0) return;
		int pi = (i - 1) / 2;
		if(al.get(i) > al.get(pi)) {
			swap(i, pi);
			upHeapify(pi);
		}
	}
	
	public int remove() {
		if(al.size() == 0) return -1;
		swap(0, al.size() - 1);
		int val = al.remove(al.size() - 1);
		downHeapify(0);
		return val;
	}
	
	public void downHeapify(int pi) {
		int max = pi;
		int li = 2*pi + 1;
		int ri = 2*pi + 2;
		if(li < al.size() && al.get(li) > al.get(max)) {
			max = li;
		}
		if(ri < al.size() && al.get(ri) > al.get(max)) {
			max = ri;
		}
		
		if(max != pi) {
			swap(max, pi);
			downHeapify(max);
		}
	}
}