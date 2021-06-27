package maventic;

import java.util.*;

public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 2, 3, 9, 9, 1, 4, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		for(int e : map.keySet()) {
			System.out.println(e + " --> " + map.get(e));
		}
		System.out.println(map);
		for(int e : map.keySet()) {
			if(map.get(e) == 1) System.out.print(e + " ");
		}
	}

}
