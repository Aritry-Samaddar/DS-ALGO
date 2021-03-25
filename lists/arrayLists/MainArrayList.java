package lists.arrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList fruits = new ArrayList();
//		fruits.add("Apple");
//		fruits.add(23);
//		System.out.println(fruits);
		
//		ArrayList<String> fruits = new ArrayList();
//		fruits.add("Orange");
//		fruits.add("Apple");
//		System.out.println(fruits);
		
//		ArrayList<Integer> marks = new ArrayList();
//		marks.add(50);
//		marks.add(100);
//		System.out.println(marks);
		
		List<String> fruits = new ArrayList();
		List<String> fruits2 = new LinkedList();
		List<String> vegetables = new ArrayList();
		fruits2.add("Apple");
		fruits2.add("Orange");
		fruits2.add("Mango");
		fruits2.set(0, "Banana");
		System.out.println(fruits2.get(1));
		System.out.println(fruits2);
		
		vegetables.add("Carrot");
		vegetables.add("Potato");
		vegetables.add("Tomato");
		
		fruits2.addAll(vegetables);
		
		System.out.println(fruits2);
		System.out.println(vegetables);
		vegetables.remove(1);
		System.out.println(vegetables);
		Pair<String, Integer> a1 = new Pair("Aritry", 50);
		Pair<Boolean, String> a2 = new Pair(true, "Hello");
		
		a1.getDescription();
		a2.getDescription();
		
		fruits.add("oreo");
		fruits.add("debu");
		fruits.add("adi");
//		List<String> toRemove = new ArrayList();
//		toRemove.add("oreo");
//		toRemove.add("debu");
//		fruits.removeAll(toRemove);
//		System.out.println(fruits.size());
//		System.out.println(fruits.contains("Guava"));
//		System.out.println(fruits.isEmpty());
//		fruits.clear();
		
		Object x[] = fruits.toArray();
//		fruits.toArray(x);
		for(Object j : x) {
			System.out.print(j + " ");
		}
		System.out.println();
	    String s[] = new String[fruits.size()];
	    fruits.toArray(s);
	    for(String i : s) {
	    	System.out.print(i + " ");
	    }
		System.out.println();
		System.out.println(fruits);
		
		List<String> name = new LinkedList<>();
		name.add("a");
		name.add("b");
		name.add("c");
		for(String k : name) {
			System.out.print(k + " ");
		}

	}

}
