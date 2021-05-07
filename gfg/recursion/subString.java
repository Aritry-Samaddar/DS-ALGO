package gfg.recursion;

import java.util.*;

public class subString {
//	One by one fix characters and recursively generates all subsets starting from them. 
//	After every recursive call, we remove last character so that the next permutation can be generated. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
        printSubSeq(str);

	}
	
	// str : Stores input string
    // n : Length of str.
    // curr : Stores current permutation
    // index : Index in current permutation, curr
    static void printSubSeqRec(String str, int n,
                               int index, String curr)
    {
        // base case
        if (index == n) {
            return;
        }
        if (curr != null && !curr.trim().isEmpty())
        {
            System.out.println(curr);
        }
        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            printSubSeqRec(str, n, i, curr);
 
            // backtracking
            curr = curr.substring(0, curr.length() - 1);
        }
    }
 
    // Generates power set in
    // lexicographic order.
    static void printSubSeq(String str)
    {
        int index = -1;
        String curr = "";
 
        printSubSeqRec(str, str.length(), index, curr);
    }
	
	

}
