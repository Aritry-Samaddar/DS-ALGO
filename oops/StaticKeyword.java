package oops;

public class StaticKeyword {
	
//	class person {
//		int age;
//		String name;
//		final static String breed = "Homo Sapiens";
//	}
	static {
		System.out.println("in block 1");
	}
	static {
		System.out.println("in block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Math.PI);
//		System.out.println(Math.max(24, 12));
		//Math class
		//int.MAX_VALUE
		//System.out.println(Integer.MAX_VALUE);
//		static int square(int x) {
//			return x*x;
//		}
//		A objA = new A();
//		A.B objB = objA.new B();
//		A.C objC = new A.C();
		System.out.println("inside main");
		

	}
	static {
		System.out.println("in block 3");
	}

}
