package comparatorsAndComparables;

public class Student implements Comparable<Student> {
	
	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		if(this.marks > o.marks) return -1;     // decreasing order
//		else if(this.marks < o.marks) return 1;
////		return 0;
//		return this.name.compareTo(o.name);
		
		return this.marks - o.marks;    // increasing order
	}

}
