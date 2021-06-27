package foreignProjects;

public class shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 243;
		String s = Integer.toBinaryString(a);
		System.out.println("Number " + a + " to binary --> " + s);
		
		s += "00";
		System.out.println("After applying left shift --> " + s);
		
		System.out.println();
		
		System.out.print("left shifted number --> ");
		System.out.print(a << 2);
		
		System.out.println();
		
		int b = 330;
		String s1 = Integer.toBinaryString(b);
		System.out.println("Number " + b + " to binary --> " + s1);
		
		s1 = s1.substring(0, s1.length() - 2);
		System.out.println("After applying right shift --> " + s1);
		
		System.out.println();
		
		System.out.print("right shifted number --> ");
		System.out.print(b >> 2);
	}

}
