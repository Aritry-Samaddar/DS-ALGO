package Sets;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> x = new HashSet<>();
		x.add(2);
		x.add(1);
		x.add(6);
		
		Set<Integer> y = new HashSet<>();
		y.add(3);
		y.add(1);
		y.add(16);
		
		x.retainAll(y);
		System.out.println(x);

	}

}
