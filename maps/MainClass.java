package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("five", 5);
		
//		numbers.put("one", 10);
//		numbers.putIfAbsent("one", 10);
//		
//		System.out.println(numbers);
//		System.out.println(numbers.get("two"));
//		System.out.println(numbers.get("three"));
//		System.out.println(numbers.containsKey("one"));
//		System.out.println(numbers.containsValue(2));
		
		numbers.replace("one", 1, 10);
//		numbers.remove("two");
		numbers.remove("two", 0);
		numbers.remove("two", 2);
		System.out.println(numbers);
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		
		Set<Entry<String, Integer>> entries = numbers.entrySet();
		
		for(Entry<String, Integer> entry : entries) {
			entry.setValue(entry.getValue() * 100);
		}
		
		System.out.println(numbers);
		
		
		Set<String> keys = numbers.keySet();
		Collection<Integer> values = numbers.values();
		
		for(int value : values) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		for(String key : keys) {
			System.out.print(key + " ");
		}
		System.out.println();
		
		
		System.out.println(getHash("CAT"));
		System.out.println(getHash("DOG"));
		System.out.println(getHash("BALL"));
		System.out.println(getHash("GOD"));

	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i < s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}
