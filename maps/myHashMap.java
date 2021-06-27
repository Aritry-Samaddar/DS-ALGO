package maps;

import java.util.*;

public class myHashMap {

	public static class HashMap<k, v> {
		private class HMNode {
			k key;
			v value;
			HMNode(k key, v value) {
				this.key = key;
				this.value = value;
			}
		}
		
		private int size;
		private LinkedList<HMNode>[] buckets;
		
		public HashMap() {
			initBuckets(4);
			size = 0;
		}
		
		public void initBuckets(int n) {
			buckets = new LinkedList[n];
			for(int bi = 0; bi < buckets.length; bi++) {
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
