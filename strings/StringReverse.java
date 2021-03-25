package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//      System.out.println("Enter how many numbers you want to put to find the largest one : ");
//        int n = sc.nextInt();
//      int[] A = new int[n];
//      int max = 0;
//      for(int i = 0; i < n; i++) {
//      	A[i] = sc.nextInt();
//      }
//      for(int i = 0; i < n; i++) {
//      	if(A[i] > max){
//              max = A[i];
//          }
//      }
//      System.out.println("The largest element of given array is : " + max);
		
        
//        long max = 0;
//        for(int i = 0; i < n; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
        
        
//		int[] arr = new int[n];
//		int[] arr2 = new int[n];
//		for(int k = 0; k < n; k++) {
//			arr[k] = sc.nextInt();
//		}
//		arr2[0] = arr[n - 1];
//	    int i = 1;
//	    while(i < n) {
//	        for(int j = 0; j < n - 1; j++) {
//	        arr2[i] = arr[j];
//	        i++;
//	    }
//	    }
//	    for(int item : arr2) {
//	    	System.out.print(item + " ");
//	    }
        
//  [      int x = arr[n - 1];
//        for(int i = n - 1; i > 0; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[0] = x;                              ] // gfg code

        

        // long min = arr[0];
        // long max = arr[0];
        // for(int i = 1; i < n; i++) {
        //     if(arr[i] < min) {
        //         min = arr[i];
        //     }
        //     if(arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // return min;
        // return max;
    	
//    	  pair p;
//        long min = a[0];
//        long max = a[0];
//        for(int i = 1; i < n; i++) {
//            if(a[i] < min) {
//                min = a[i];
//            }
//            if(a[i] > max) {
//                max = a[i];
//        }
    //}
//        p = new pair(min,max);
//        return p;
        
        
//        pair p;
//        long mn= a[0];
//        long mx =-1;
//        for (int i = 0; i < a.length; i++) {
//        mn = Math.min(a[i], mn);
//        mx = Math.max(a[i], mx);
//        
//    }
//     p = new pair(mn,mx);
//     return p;
        
        
//      Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		for(int i = 0; i < T; i++) {
//		    int N = sc.nextInt();
//		    int D = sc.nextInt();
//		    int[] arr = new int[N];
//		    int[] arr2 = new int[N];
//		    for(int j = 0; j < N; j++) {
//		        arr[j] =sc.nextInt();
//		    }
//		    for(int j = 0; j < N; j++) {
//		        arr2[j] = arr[D];
//		        D++;
//		        if(D > (N - 1)) {
//		            D = 0;
//		        }
//		    }
//		    for(int item : arr2) {
//		        System.out.print(item + " ");
//		    }
//		    System.out.println();
//		}
        
        
//        int m = 0;
//        int s1 = 0;
//        int s2 = 0;
//        for(int i = 0; i < n / 2; i++) {
//            s1 += arr[i];
//        }
//        for(int i = n / 2; i < n; i++) {
//            s2 += arr[i];
//        }
//        m = s1 * s2;
//        return m;
		
//		int T = sc.nextInt();
//		for(int i = 0; i < T; i++) {
//		    int n = sc.nextInt();
//		    int d = 0;
//		    int[] A = new int[n];
//		    for(int j = 0; j < n; j++) {
//		        A[j] = sc.nextInt();
//		    }
//		    for(int j = 0; j < n; j++) {
//		        if(A[j] == A[j + 1]) {
//		            d = A[j];
//		            break;
//		        }
//		    }
//		    System.out.println(d);
//		}
		
//		for(int j = 1; j < n; j = j + 2) {
//            if(a[j] < a[j - 1]) {
//                int x = a[j - 1];
//                a[j - 1] = a[j];
//                a[j] = x;
//            }
//        }
//        return a;
		
		
//		int min = brr[0];
//        int max = arr[0];
//        int p = 0;
//        for(int i = 1; i < n; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for(int i = 1; i < m; i++) {
//            if(brr[i] < min) {
//                min = brr[i];
//            }
//        }
//        p = max * min;
//        return p;
		
//		int s1 = 0;
//        int s2 = 0;
//        int s = 0;
//        for(int i = 0; i < n / 2; i++) {
//            s1 += a[i];
//        }
//        for(int i = n / 2; i < n; i++) {
//            s2 += a[i];
//        }
//        s = s1 - s2;
//        return Math.abs(s);
//		int n = 42;
//		int k = 30;
//		int[] arr = {335, 501, 170, 725, 479, 359, 963, 465, 706, 146, 282, 828, 962, 492, 996, 943, 828, 437, 392, 605, 903, 154, 293, 383, 422, 717, 719, 896, 448, 727, 772, 539, 870, 913, 668, 300, 36, 895, 704, 812, 323, 334};
//		//int[] arr = {322, 559, 647, 983, 482, 145, 197, 223, 130, 162, 536, 451, 174, 467};
//		int[] a = new int[k];
//        int b = 0;
//        int c;
//        for(int i = 0; i < k; i++) {
//            c = 0;
//            for(int j = 0; j < n; j++) {
//                if(arr[j] > c && b == 0) {
//                    c = arr[j];
//                } else if(arr[j] > c && arr[j] < b) {
//                    c = arr[j];
//                }
//            }
//            b = c;
//            a[i] = c;
//            int p = k - (i + 1);
//            int d = 0;
//            for(int l = 0; l < n; l++) {
//                if(c == arr[l]) {
//                    d += 1;
//                    
//                }
//            }
//            if((d - 1) <= p && (d - 1) != 0) {
//            	for(int y = 0; y < d - 1; y++) {
//                    a[i + 1] = c;
//                    i++;
//                }
//            }
//        }
//		boolean isChecked = true;
//		for(int i = 0; i < n - 1; i++) {
//			for(int j = 0; j < n - 1 - i; j++) {
//				if(arr[j + 1] > arr[j]) {
//					int temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//					isChecked = false;
//				}
//			}
//			if( isChecked == true) break;
//		}
//		for(int l = 0; l < k; l++) {
//			a[l] = arr[l];
//		}
//        for(int item : a) {
//        	System.out.print(item + " ");
//        }
		
		
//        class Solution {
//            int[] kLargest(int[] arr, int n, int k) {
//                // code here
//                Arrays.sort(arr);
//                int[] a = new int[k];
////                 boolean isChecked = true;
////         		for(int i = 0; i < n - 1; i++) {
////         			for(int j = 0; j < n - 1 - i; j++) {
////         				if(arr[j + 1] > arr[j]) {
////         					int temp = arr[j + 1];
////         					arr[j + 1] = arr[j];
////         					arr[j] = temp;
////         					isChecked = false;
////         				}
////         			}
////         			if( isChecked == true) break;
////         		}
//        		for(int l = 0; l < k; l++) {
//        			a[l] = arr[n - 1 - l];
//        		}
//                //d = Integer.parseInt(a);
//                return a;
//                
//            }
//        }
//        int[] a = {5, 1, 0, 2, 7};
//        Arrays.sort(a);
//        for(int item : a) {
//        	System.out.print(item + " ");
//        }
		
		
//		class Triplet
//		{
//		    // Function to check if triplet is present 
//		    // arr[]: input array
//		    // n: size of the array
//			public boolean findTriplets(int arr[] , int n)
//		    {
//		        //add code here.
//		        Arrays.sort(arr);
//		        for(int i = 0; i < n; i++) {
//		            for(int j = i + 1; j < n; j++) {
//		                for(int k = j + 1; k < n; k++) {
//		                    if(arr[i] + arr[j] + arr[k] == 0) {
//		                        return true;
//		                    }
//		                }
//		            }
//		        }
//		        return false;
//		    }
//		}
		
		
//		class Triplet
//		{
//		    // Function to check if triplet is present 
//		    // arr[]: input array
//		    // n: size of the array
//			public boolean findTriplets(int arr[] , int n)
//		    {
//		        //add code here.
//		        Arrays.sort(arr);
//		        for(int i = 0; i < n - 2; i++) {
//		            if(twoSum(arr, -arr[i], i + 1)) return true;
//		        }
//		        return false;
//		       
//		    }
//		    public boolean twoSum(int arr[], int x, int i) {
//		        int j = arr.length - 1;
//		        while(i < j) {
//		            if(arr[i] + arr[j] < x) {
//		                i++;
//		            } else if(arr[i] + arr[j] > x) {
//		                j--;
//		            } else {
//		                return true;
//		            }
//		        }
//		        return false;
//		        
//		    }
//		}
		
		
		
        
	}


}
