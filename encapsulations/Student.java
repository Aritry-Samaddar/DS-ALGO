package encapsulations;

public class Student {
	
//	int age;
//	String name;
	private int age;
	private String name;
	private Joke joke;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 20) {
			System.out.println("You are too old to be a student in our school.");
		} else {
			this.age = age;
		}
	}
	
	public Joke getJoke() {
		return joke;
	}
	
	public void setJoke(Joke joke) {
		this.joke = joke;
	}

	public static void main(String[] args) {
		
		

	}

}
