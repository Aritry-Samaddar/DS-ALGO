package lists.arrayLists;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MyArrayList<String> al = new MyArrayList<>();
		MyArrayList<String> al2 = new MyArrayList<>();
		al.add("ari");
		al.add("adi");
		al.add("debu");
		al.add("50");
		al.add("60");
//		al.set(0, "oreo");
		
//		al.print();
		
//		System.out.println(al.get(1));
		
		al2.add("a");
		al2.add("b");
		al2.add("c");
		al2.add("d");
		
		al.addAll(al2);
		
//		Object[] x = al.toArray();
//		for(Object j : x) {
//			System.out.print(j + " ");
//		}
		
		String[] s = new String[al.size()];
		al.toArray(s);
		for(String i : s) {
	    	System.out.print(i + " ");
	    }
//		MyArrayList<Integer> ns = new MyArrayList<>();
//		ns.add(1);
//		ns.add(2);
//		ns.add(3);
//		ns.clear();
//		ns.add(4);
//		ns.print();
//		System.out.println(ns.isEmpty());
		
//		al.print();
//		
//		al.remove(3);
//		al.add("e");
//		al.add("50");
//		al.print();
//		System.out.println(al.size());
////		System.out.println(al.get(8));
//		MyArrayList<String> ns = new MyArrayList<>();
//		ns.add("ari");
//		ns.add("adi");
//		ns.add("debu");
//		
//		al.removeAll(ns);
//		al.print();
//		System.out.println(al.size());

	}

}
