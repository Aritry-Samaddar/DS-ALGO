package maventic;

import java.util.*;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 6, 4, 3, 3, 8, 4};
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else map.put(arr[i], 1);
		}
		for(int e : map.values()) {
			if(e > 1) count++;
		}
		System.out.println(count);
		System.out.println(map.entrySet());
	}

}
