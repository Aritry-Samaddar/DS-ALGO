package maventic;

import java.util.*;

public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {2, 7, 3, 2, 3, 7, 7};
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < numbers.length; i++) {
			if(!set.contains(numbers[i])) {
				set.add(numbers[i]);
				System.out.print(numbers[i] + " ");
			}
		}
	}

}
