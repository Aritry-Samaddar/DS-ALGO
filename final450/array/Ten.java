package final450.array;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n = a.length;
//		int i = 0;
		int count = 0;
//		while(i < n) {
//			i += a[i];
//			count++;
//		}
		int j = 0;
		for(int i = 0; i < n; i += j) {
			j = a[i];
			count++;
			if(i + j > n - 1) break;
		}
		System.out.println(count);
		
		
		
		
		
		
//		if (a.length <= 1)
//	        System.out.println(0);
//	    if (a[0] == 0)
//	        System.out.println(-1);
//	    int maxReach = a[0];
//	    int step = a[0];
//	    int jump = 1;
//	    for (int i = 1; i < a.length; i++) {
//	        if (i == a.length - 1)
//	            System.out.println(jump);
//	        maxReach = Math.max(maxReach, i + a[i]);
//	        step--;
//	        if (step == 0) {
//	            jump++;
//	            if (i >= maxReach)
//	                System.out.println(-1);
//	            step = maxReach - i;
//	        }
//	    }
//	    System.out.println(-1);

	}

}
