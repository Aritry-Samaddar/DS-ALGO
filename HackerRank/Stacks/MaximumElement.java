package HackerRank.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        Stack<Integer> s = new Stack<>();
//        for(int i = 0; i < t; i++) {
//            int q = sc.nextInt();
//            if(q == 1) {
//            	int val = sc.nextInt();
//                s.push(val);
//                continue;
//            }
//            if(q == 2) {
//                s.pop();
//                continue;
//            }
//            if(q == 3) {
//                int max = 0;
//                Object s1 = s.clone();
//                while(!((Stack<Integer>) s1).empty()) {
//                    int j = ((Stack<Integer>) s1).peek();
//                    if(j > max) max = j;
//                    ((Stack<Integer>) s1).pop();
//                }
//                System.out.println(max);
//            }
//        }
		
		
		Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
		
		Scanner snr = new Scanner(System.in);
        int n = snr.nextInt();
        for(int i=0;i<n;i++) {
            int input = snr.nextInt();
            switch (input){
                case 1:
                    int x = snr.nextInt();
                    stack.push(x);
                    if(maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                    break;
 
                case 2:
                    int popVl = stack.pop();
                    if(popVl == maxStack.peek()) {
                        maxStack.pop();
                    }
                    break;
 
                case 3:
                    System.out.println(maxStack.peek());
                    break;
 
                default: break;
            }
        }
        snr.close();

	}

}
