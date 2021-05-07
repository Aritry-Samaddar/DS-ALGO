package projects;

import java.util.*;

public class plusCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] input = "111".toCharArray();
		char[] output = new char[100];
		ArrayList<String> al = new ArrayList<>();
		int given = 12;
		int ans = -1;
		plus(input, 0, output, 0, al);
		for(int i = 0; i < al.size(); i++) {
			
		}
		System.out.println(ans);

	}
	
	static void plus(char[] input, int index, char[] output, int outLength, ArrayList<String> al) {
		if(index >= input.length) {
			al.add(String.valueOf(output));
			return;
		}
		output[outLength] = input[index];
		output[outLength + 1] = ' ';
		plus(input, index + 1, output, outLength + 2, al);
		if(input.length != index + 1) {
			plus(input, index + 1, output, outLength + 1, al);
		}
	}
	
}
