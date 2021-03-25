package gfg.array;

import java.util.Scanner;

public class RotateArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		    int N = sc.nextInt();
		    int D = sc.nextInt();
		    int[] arr = new int[N];
		    int[] arr2 = new int[N];
		    for(int j = 0; j < N; j++) {
		        arr[j] =sc.nextInt();
		    }
		    for(int j = 0; j < N; j++) {
		        arr2[j] = arr[D];
		        D++;
		        if(D > (N - 1)) {
		            D = 0;
		        }
		    }
		    for(int item : arr2) {
		        System.out.print(item + " ");
		    }
		    System.out.println();
		}

	}

}
