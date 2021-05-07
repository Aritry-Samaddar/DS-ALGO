package gfg.recursion;

public class rElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 3, 4, 5};
		int[] output = new int[3];
		fun(input, output, 0, input.length, 0, 3);

	}
	
	static void fun(int[] input, int[] output, int index, int n, int i, int r) {
		if(index == r) {
			for(int j = 0; j < output.length; j++) {
				System.out.print(output[j] + " ");
			}
			System.out.println();
			return;
		}
		for(int k = i; k < n; k++) {
			output[index] = input[k];
			fun(input, output, index + 1, n, k + 1, r);
		}
	}

}
