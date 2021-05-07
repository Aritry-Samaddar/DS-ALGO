package gfg.recursion;

public class combDigit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] input = "1234".toCharArray();
		char[] output = new char[100];
		comb(input, 0, output, 0);

	}
	
	static void comb(char[] input, int index, char[] output, int outLength) {
		if(index >= input.length) {
			System.out.println(String.valueOf(output));
			return;
		}
		output[outLength] = input[index];
		output[outLength + 1] = ' ';
		comb(input, index + 1, output, outLength + 2);
		if(input.length != index + 1) {
			comb(input, index + 1, output, outLength + 1);
		}
	}

}
