package lists.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class minPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++) {
           s.push(arr[i]); 
        }
        while(s.size() != 0) {
            // Heap<Integer> h = new Heap<>(s);
            // System.out.print(h.peek() + " ");
            ArrayList<Integer> al = new ArrayList<>(s);
            Collections.sort(al);
            System.out.print(al.get(0) + " ");
            s.pop();
        }

	}

}
