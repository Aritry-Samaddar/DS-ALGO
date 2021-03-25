package encapsulations;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
		Student obj = new Student();
//		obj.name = "Tom";
//		obj.age = 56;
		
		obj.setAge(45);
		obj.setAge(15);
		
		System.out.println(obj.getAge());
		
		
	    
		
		Joke joke = null;
		obj.setJoke(joke);
		System.out.println(obj.getJoke());
		

	}

}
