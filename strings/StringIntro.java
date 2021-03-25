package strings;

public class StringIntro {

	public static void main(String[] args) {
		
//		String name = "Anuj";
//		String anotherName = new String("Aman");
//		System.out.println(anotherName);
//		String name = "Anuj";
//		String anotherName = new String("Anuj");
//		System.out.println(name == anotherName);
//		String name = "Anuj";
//		String name2 = "Anuj";
//		System.out.println(name == name2);
//		String name = "Anuj";
//		name = "Kumar";
//		System.out.println(name);
		String name = "Aritry Samaddar";
		String name2 = new String("Aritry Samaddar");
		String name3 = "";
		System.out.println(name.charAt(1));
		System.out.println(name.length());
		System.out.println(name.substring(7));
		System.out.println(name.substring(7, 15));
		System.out.println(name.subSequence(7, 15));
		System.out.println(name.contains("oreo"));
		System.out.println(name.equals(name2));
		System.out.println(name3.isEmpty());
		String names = "Aritry";
		names = names + " Brijesh";
		System.out.println(names.concat(" Sayan"));
		System.out.println(name.replace('a', 'o'));
		String love = "food,sleep,movie,technology,phone,friends";
		String loves[] = love.split(",");
		for(String print: loves) {
			System.out.println(print);
		}
		System.out.println(love.indexOf('s'));
		System.out.println(love.indexOf('z'));
		System.out.println(name.toLowerCase());
		System.out.println(love.toUpperCase());
		String car = "     MARUTI      SUZUKI";
		System.out.println(car.trim());


	}

}
