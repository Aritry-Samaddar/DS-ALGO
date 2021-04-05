package Sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> fruits = new HashSet<>();
		
		fruits.add("apple");
		fruits.add("banana");
		System.out.println(fruits.add("kiwi"));
		System.out.println(fruits.add("apple"));
		System.out.println(fruits);
		
		Set<Integer> integer = new LinkedHashSet<>();
		
		integer.add(10);
		integer.add(5);
		integer.add(1);
		System.out.println(integer);
		
		Set<Integer> integer2 = new TreeSet<>();

		integer2.add(10);
		integer2.add(5);
		integer2.add(1);
		System.out.println(integer2);
	}

}
