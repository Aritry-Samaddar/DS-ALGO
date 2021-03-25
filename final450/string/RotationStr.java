package final450.string;

public class RotationStr {
	static boolean areRotations(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "ABACD";
//        String str2 = "CDABA";
//        String temp = str1 + str1;
//        int i = 0;
//        int j = 0;
//        boolean is = true;
//        while(i < str2.length() && j < temp.length()) {
//        	if(str2.charAt(i) == temp.charAt(j)) {
//        		for(int k = 0; k < str2.length(); k++) {
//        			if(str2.charAt(k) == temp.charAt(j)) {
//        				j++;
//        			} else {
//        				is = false;
//        				System.out.println(false);
//        				break;
//        			}
//        		}
//        		if(is == true)
//        		System.out.println(true);
//        		break;
//        	} else {
//        		j++;
//        	}
//        }
		
		
		
		
		String str1 = "ABACD";
		String str2 = "CDABA";
		if(areRotations(str1, str2)) {
			System.out.println("Strings are rotations of each other");
		} else {
			System.out.println("Strings are not rotations of each other");
		}


	}

}
