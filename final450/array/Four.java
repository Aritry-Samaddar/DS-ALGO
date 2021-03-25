package final450.array;

import java.util.Arrays;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0, 2, 1, 2, 0};
		int n = a.length;
//		Arrays.sort(a);
//	    String b = "";
//	    for(int i = 0; i < n; i++) {
//	    	if(a[i] < 3) {
//	    		b += a[i] + " ";
//	    	} else {
//	    		break;
//	    	}
//	    }
//	    System.out.print(b);
		
//		Arrays.sort(a);
		
		int lo = 0;
		int hi = n - 1;
		int mid = 0, temp = 0;
		while(mid <= hi) {
			switch(a[mid]) {
			case 0 : {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1 : {
				mid++;
				break;
			}
			case 2 : {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}
		}
		for(int item : a) {
			System.out.print(item + " ");
		}

	}

}
