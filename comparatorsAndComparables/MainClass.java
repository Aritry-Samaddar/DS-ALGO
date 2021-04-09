package comparatorsAndComparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Ram"));
		students.add(new Student(35, "Shyam"));
		students.add(new Student(83, "Aman"));
		students.add(new Student(13, "Ram"));
		students.add(new Student(13, "Anuj"));
		
//		Collections.sort(students, new sortByNameThenMarks());
		
//		Collections.sort(students, new Comparator<Student>() {     // anonymous comparator class
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;
//				} else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//		});
		
		
//		Collections.sort(students,  (o1, o2) -> {                 // using lambda based on name then marks if names are same
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;   // increasing order
//				} else {
//					return o1.name.compareTo(o2.name); // sorting in dictionary order of name
//				}
//			});
		
		
//		Collections.sort(students,  (o1, o2) -> o1.name.compareTo(o2.name));  // using lambda based on name only
		
		
//		Collections.sort(students, Comparator.comparing(Student :: getName));  
		                                                      // (Comparator class gives this advantage) KeyExtractor based on name(name as a key) 
		                                                                  // getName(), method of Student class, returns name, sort based on name,
		                                                                  //   dictionary order
		
		
//		Collections.sort(students, Comparator.comparing(Student :: getName).thenComparing(Student :: getMarks));  // sortByNameThenMarks
		
		Collections.sort(students, Comparator.comparing(Student :: getName).thenComparing(Student :: getMarks).reversed());
		                                                                      // .reversed() ---> helps to reverse the sorting order
		                                                                                                    // was followed till now
		                                                                        // both name then marks (if name same) sorting order will reverse
		
		
		students.forEach(System.out::println);    // lambda method

	}

}
//class sortByNameThenMarks implements Comparator<Student> {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		if(o1.name.equals(o2.name)) {
//			return o1.marks - o2.marks;
//		} else {
//			return o1.name.compareTo(o2.name);
//		}
//	}
//	
//}