import java.util.*;

public class oddBaloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count = 1;
		char[] arr = new char[t];
		for(int i = 0; i < t; i++) {
			arr[i] = sc.next().charAt(0);
		}
		Map<Character, Integer> hm = new HashMap<>();
		for(int i = 0; i < t; i++) {
			hm.put(arr[i], hm.containsKey(arr[i]) ? hm.get(arr[i]) + 1 : 1);
		}
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue() % 2 != 0) {
				System.out.println(entry.getKey());
				count = 0;
				break;
			}
		}
		if(count == 1) System.out.println("ALL BALOONS ARE EVEN NUMBERED!!");
	}

}
