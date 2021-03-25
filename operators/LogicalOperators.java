package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
//		int number = 45;
//		if(number >= 1 && number <= 100) { // in the case of &&(logical and) if the 1st condition is false then without checking the other conditions it will conclude false.
//			System.out.println("Number is in the range.");
//		}
//in & every conditions have to be true then only result will be true.
//		if(number >= 1 & number <= 100) { // in the case of &(bitwise and) inspite of being the 1st condition false, it will check the other conditions and then it will conclude the result false.
//			System.out.println("Number is in the range.");
//		}

//		int grade = 11;
//		if(grade == 10 || grade == 12) { // in the case of ||(logical or) if the 1st condition is true then without checking the other conditions it will conclude true.
//			System.out.println("You can give board exams now.");
//		}
//		//in | any one of the conditions has to be true then the result will be true.
//		if(grade == 10 | grade == 12) { // in the case of |(bitwise or) inspite of being the 1st condition true, it will check the other conditions and then it will conclude the result true.
//			System.out.println("You can give board exams now.");
//		}
		
		int grade = 11;
		if(!(grade == 10 || grade == 12)) {
			System.out.println("You can not give board exams now.");
		}
	}

}
