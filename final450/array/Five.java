package final450.array;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-12, 11, -3, -13, -5, 6, -7, 5, -3, -6};
		int n = a.length;
		//int[] b = new int[n];
		int i = 0;
		//int k = 0;
		int j = n - 1;
		//int j = 0;
//		while(i < n) {
//			if(a[i] < 0) {
//				b[k] = a[i];
//				k++;
//				i++;
//			} else if(a[i] > 0) {
//				b[j] = a[i];
//				j--;
//				i++;
//			}
//		}
		
		
//		while(i < j) {
//			if(a[i] < a[j]) {
//				if(a[i] < 0) {
//					i++;
//				} else if(a[i] > 0) {
//					j--;
//				}
//			} else if(a[i] > a[j]) {
//				int temp = a[i];
//				a[i] = a[j];
//				a[j] = temp;
//				j--;
//				if(a[i] < 0) i++;
//			} else if(a[i] == a[j]) {
//				if(a[i] < 0) {
//					i++;
//				} else if(a[i] > 0) {
//					j--;
//				}
//			}
//		}
		
//		for(int i = 0; i < n; i++) {
//			if(a[i] < 0) {
//				if(i != j) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//				j++;
//			}
//		}
		
		while(i < j) {
			if(a[i] < 0 && a[j] < 0) {
				i++;
			} else if(a[i] > 0 && a[j] < 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			} else if(a[i] > 0 && a[j] > 0) {
				j--;
			} else {
				i++;
				j--;
			}
		}
		for(int item : a) {
			System.out.print(item + " ");
		}

	}

}
