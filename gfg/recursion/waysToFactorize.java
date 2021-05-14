package gfg.recursion;

import java.util.*;

public class waysToFactorize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> result_list = new ArrayList<>();
		List<Integer> single_result_list = new ArrayList<>();
		factor(2, 1, 16, result_list, single_result_list);
//		System.out.println(result_list);
		for(int i = 0; i < result_list.size(); i++) {
			for(int j = 0; j < result_list.get(i).size(); j++) {
				System.out.print(result_list.get(i).get(j) + " ");
			}
			System.out.println();
		}
		

		
	}

	static void factor(int first, int each_prod, int n, List<List<Integer>> result_list, List<Integer> single_result_list) {
		if(first >= n || each_prod > n) return;
		if(each_prod == n) {
			ArrayList<Integer> al = new ArrayList<>(single_result_list);
			result_list.add(al);
			return;
		}
		for(int i = first; i < n; i++) {
			if(i * each_prod > n) break;
			if(n % i == 0) {
				single_result_list.add(i);
				factor(i, i * each_prod, n, result_list, single_result_list);
				single_result_list.remove(single_result_list.size() - 1);
			}
		}
	}
}
