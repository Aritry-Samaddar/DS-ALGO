package final450.array;

import java.util.Arrays;

public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,2,2};
		int n = nums.length;
		Arrays.sort(nums);
		for(int i = 0; i < n - 1; i++) {
			if(nums[i] == nums[i + 1]) {
				System.out.println(nums[i]);
				break;
			}
		}

	}

}
