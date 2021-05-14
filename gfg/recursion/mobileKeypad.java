package gfg.recursion;

import java.util.*;

public class mobileKeypad {
	/* Approach: It can be observed that each digit can represent 3 to 4 different alphabets (apart from 0 and 1). 
	 * So the idea is to form a recursive function. Then map the number with its string of probable alphabets, i.e 2 with “abc”, 3 with “def” etc.
	 * Now the recursive function will try all the alphabets, mapped to the current digit in alphabetic order, and again call the recursive 
	 * function for the next digit and will pass on the current output string.
	 */

	static Character[][] numberToCharMap;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 3, 4};
		printWords(numbers);
	}
	
	static void printWords(int[] numbers) {
		generateNumberToCharMap();
		List<String> stringList = printWords(numbers, numbers.length, 0, "");
		stringList.stream().forEach(System.out :: println);
	}
	
	static List<String> printWords(int[] numbers, int len, int numIndex, String s) {
		if(numIndex == len) {
			return new ArrayList<>(Collections.singleton(s));
		}
		List<String> stringList = new ArrayList<>();
		for(int i = 0; i < numberToCharMap[numbers[numIndex]].length; i++) {
			String sCopy = String.copyValueOf(s.toCharArray());
			sCopy = sCopy.concat(numberToCharMap[numbers[numIndex]][i].toString());
			stringList.addAll(printWords(numbers, len, numIndex + 1, sCopy));
		}
		return stringList;
	}

	static void generateNumberToCharMap() {
		numberToCharMap = new Character[10][5];
		numberToCharMap[0] = new Character[] {'\0'};
		numberToCharMap[1] = new Character[] {'\0'};
		numberToCharMap[2] = new Character[] {'a', 'b', 'c'};
		numberToCharMap[3] = new Character[] {'d', 'e', 'f'};
		numberToCharMap[4] = new Character[] {'g', 'h', 'i'};
		numberToCharMap[5] = new Character[] {'j', 'k', 'l'};
		numberToCharMap[6] = new Character[] {'m', 'n', 'o'};
		numberToCharMap[7] = new Character[] {'p', 'q', 'r', 's'};
		numberToCharMap[8] = new Character[] {'t', 'u', 'v'};
		numberToCharMap[9] = new Character[] {'w', 'x', 'y', 'z'};
	}
}
