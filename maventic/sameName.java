package maventic;

public class sameName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n1 = "lippi";
		String n2 = "niresh";
		n1 = n1.toLowerCase();
		n2 = n2.toLowerCase();
		char[] arr1 = n1.toCharArray();
		char[] arr2 = n2.toCharArray();
		int sum = 0;
		
		if(arr1.length < arr2.length) {
			char[] temp = arr1;
			arr1 = arr2;
			arr2 = temp;
		}
		
		boolean[] isVisitedArr1 = new boolean[arr1.length];
		boolean[] isVisitedArr2 = new boolean[arr2.length];
		
		for(int i = 0; i < arr2.length; i++) {
			if(arr1[i] == arr2[i]) {
				isVisitedArr1[i] = true;
				isVisitedArr2[i] = true;
				sum += 2;
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			if(isVisitedArr1[i] == true) continue;
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j] && isVisitedArr2[j] != true) {
					isVisitedArr2[j] = true;
					sum += 1;
					break;
				}
			}
		}
		
		System.out.println(sum);
	}

}
