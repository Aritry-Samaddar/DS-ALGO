package gfg.recursion;

import java.util.*;


public class test {

	static int ans;
	static Character[][] generateNumMap;
	public static void main(String[] args) {
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		
		char[] ans = new char[s.length];
        int k = 0;
        for(int i = s.length - 1; i >= 0; i--) {
            ans[k++] = s[i];
        }
//        System.out.println(ans);
        System.out.println(4 << 1);
        System.out.println(8 >> 2);
        
		// TODO Auto-generated method stub
//		replace()
//		trim()
//		split()
//		toBinaryString()
//		ch = Character.toUpperCase(ch)
//		Character.isUpperCase(ch)
//		Arrays.stream(arr).max().getAsInt();
//		Arrays.stream(arr).min().getAsInt();
//		int a=Character.getNumericValue(c);
//		int a=Integer.parseInt(String.valueOf(c));
//		int a = (int) Math.cbrt(100);
//		System.out.println(a);
//		int pow = (int)Math.pow((double)100, (double)1/3);
//		System.out.println(pow);
//		System.out.println((double)1/3);
		
//		ArrayList<char[]> al = new ArrayList<>();
		
//		String s = " Hello I'm your String";
//		String[] s1 = s.trim().split("\\s+");
//		for(int i = 0; i < s1.length; i++) {
//			System.out.println(s1[i]);
//		}
//		s = s.replaceAll("\\s+", "");
//		System.out.println(s);
//		s.replace("r", "d");
//		System.out.println(s);
//		String s = "ari";
//		String[] s1 = s.split("");
//		for(int i = 0; i < s1.length; i++) {
//			System.out.print(s1[i] + " ");
//		}
//		String s = "aritry";
//		boolean ans = find(s,'z', 0);
//		System.out.println(ans);
		
//		char[] a = {' '};
//		int ans = 0;
//		for(int i = 0; i < a.length; i++) {
//			ans += Character.getNumericValue(a[i]);
//			System.out.println(ans);
//		}
//		System.out.println(ans);
//		ArrayList<String> al = new ArrayList<>();
//        ArrayList<ArrayList<String>> a = new ArrayList<>();
//        al.add("a");
//        al.add("b");
//        al.add("c");
//        a.add(new ArrayList<>(al));
//        al.clear();
//        al.add("d");
//        al.add("e");
//        al.add("f");
//        a.add(new ArrayList<>(al));
//        System.out.println(a);

//		float f = (float) 0.7;
//		if(f == 0.7) System.out.println("yes");

//		String s = "abc de";
//		s = s.toUpperCase();
//		System.out.println(fun(s, 0));

//		fun("abc", 0, "");
		
		
//		int n1 = 1001;
//		int n = n1;
//		int[] a = new int[String.valueOf(n1).length()];
//		for(int i = String.valueOf(n1).length() - 1; i >= 0; i--) {
//			a[i] = n % 10;
//			n = n / 10;
//		}
//		System.out.print(a[0]);
//		fun(a, 1);
		 
//		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
//		ArrayList<Integer> a = new ArrayList<>();
//		fun(12, 2, 1, al, a);
//		System.out.println(al);
		
//		System.out.println(15 / 1 + fun(15 / 1, 3));
		
//		System.out.println(fun(4, 0, 0));
		
//		int m = 129814999;
//		ans = m;
//		fun(String.valueOf(m).toCharArray(), 4);
//		System.out.println(ans);
		
		generateNum();
		int[] a = {2, 3, 4};
		words(a, 0, "");
		
		List<String> al = new ArrayList<>();
		bracket(3, 0, 0, "", al);
		System.out.println(al);
		
	}
	
	static void bracket(int n, int open, int close, String s, List<String> al) {
        if(close == n) {
            al.add(s);
//            System.out.println(s);
            return;
        }
        if(open < n) bracket(n, open + 1, close, s + "(", al);
        if(close + 1 <= open) bracket(n, open, close + 1, s + ")", al);
    }
	
	static void words(int[] a, int index, String s) {
		if(index == a.length) {
			System.out.println(s);
			return;
		}
		for(int i = 0; i < generateNumMap[a[index]].length; i++) {
			String sCopy = String.copyValueOf(s.toCharArray());
			sCopy = sCopy.concat(generateNumMap[a[index]][i].toString());
			words(a, index + 1, sCopy);
		}
 		
	}
	
	static void generateNum() {
		generateNumMap = new Character[10][5];
		generateNumMap[0] = new Character[]{'\0'};
		generateNumMap[1] = new Character[]{'\0'};
		generateNumMap[2] = new Character[]{'a', 'b', 'c'};
		generateNumMap[3] = new Character[]{'d', 'e', 'f'};
		generateNumMap[4] = new Character[]{'g', 'h', 'i'};
		generateNumMap[5] = new Character[]{'j', 'k', 'l'};
		generateNumMap[6] = new Character[]{'m', 'n', 'o'};
		generateNumMap[7] = new Character[]{'p', 'q', 'r', 's'};
		generateNumMap[8] = new Character[]{'t', 'u', 'v'};
		generateNumMap[9] = new Character[]{'w', 'x', 'y', 'z'};
	}
	
	static void fun(char[] input, int k) {
		if(k == 0) {
			return;
		}
		for(int i = 0; i < input.length - 1; i++) {
			for(int j = i + 1; j < input.length; j++) {
				if(input[i] < input[j]) {
					char temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					if(Integer.parseInt(String.valueOf(input)) > ans) {
						ans = Integer.parseInt(String.valueOf(input));
					}
					fun(input, k - 1);
					char temp2 = input[i];
					input[i] = input[j];
					input[j] = temp2;
				}
			}
		}
	}
	
	static int funnn(int dest, int source, int step) {
		if(Math.abs(source) > dest) return Integer.MAX_VALUE;
		if(source == dest) return step;
		int pos = funnn(dest, source + step + 1, step + 1);
		int neg = funnn(dest, source - step - 1, step + 1);
		return Math.min(pos, neg);
	}
	
//	static int fun(int choco, int wrapper) {
//		if(choco < wrapper) return 0;
//		return choco / wrapper + fun(choco / wrapper + choco % wrapper, wrapper);
//	}
	
//	static void fun(int n, int m, int ans, ArrayList<ArrayList<Integer>> al, ArrayList<Integer> a) {
//		if(ans == n) {
//			al.add(new ArrayList<>(a));
//			return;
//		}
//		for(int i = m; i < n; i++) {
//			if(n % ans * i == 0) {
//				a.add(i);
//				fun(n, i, ans * i, al, a);
//				a.remove(a.size() - 1);
//			}
//		}
//		
//	}
	
//	static int product(int x, int y) {
//		if(y == 0) return 0;
//		if(x < y) {
//			int temp = x;
//			x = y;
//			y = temp;
//		}
//		return x + product(x, y - 1);
//	}
	
//	static void fun(int[] a, int i) {
//		if(i >= a.length) return;
//		System.out.print(a[i - 1] ^ a[i]);
//		fun(a, i + 1);
//	}
	
//	static void fun(String s, int n, int ones, int zeros) {
//		if(n == 0) {
//			System.out.println(s);
//			return;
//		}
//		fun(s + "1", n - 1, ones + 1, zeros);
//		if(zeros + 1 <= ones) {
//			fun(s + "0", n - 1, ones, zeros + 1);
//		}
//	}
	
	static int funn(int x, int n, int num) {
		int val = (int) (x - Math.pow(num, n));
		if(val == 0) return 1;
		if(val < 0) return 0;
		return funn(x, n, num + 1) + funn(val, n, num + 1);
	}
	
//	static void fun(int[] a, int n, int i, int sum) {
//		if(i > n) {
//			System.out.print(sum + " ");
//			return;
//		}
//		fun(a, n, i + 1, sum + a[i]);
//		fun(a, n, i + 1, sum);
//	}
	
	static List<Integer> process(int n, List<Integer> al, int i, boolean flag) {
        if(i > n && !al.isEmpty()) return al;
        al.add(i);
        if(i <= 0 || flag == false) return process(n, al, i + 5, false);
        else return process(n, al, i - 5, true);
    }
	
//	static void fun(int[] a, int n) {
//		if(n <= 0) return;
//		fun(a, n - 1);
//		int temp = a[n - 1];
//		int j = n - 2;
//		while(j >= 0 && a[j] > temp) {
//			a[j + 1] = a[j];
//			j--;
//		}
//		a[j + 1] = temp;
//	}
	
//	static void fun(int[] a, int n) {
//		for(int i = 1; i < n; i++) {
//			int temp = a[i];
//			for(int j = i - 1; j >= 0; j--) {
//				if(a[j] > temp) {
//				    temp = a[j + 1];
//					a[j + 1] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//	}
	
	static int max(int[] a, int n, int i) {
	    return (n == 1) ? a[i] : Math.max(a[i], max(a, n - 1, i + 1));
	}
	
//	static void fun(String s, int index, String ans) {
//		System.out.println(ans);
//		if(index >= s.length()) {
//			return;
//		}
//		for(int i = index; i < s.length(); i++) {
//			ans += s.charAt(i);
//			fun(s, i + 1, ans);
//			ans = ans.substring(0, ans.length() - 1);
//		}
//	}
	
//	static int fun(String s, int i) {
//		if(i >= s.length()) return 0;
//		if(s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O' && s.charAt(i) != 'U' && 
//				s.charAt(i) >= 65 && s.charAt(i) <= 90) {
//			return 1 + fun(s, i + 1);
//		} else {
//			return fun(s, i + 1);
//		}
//	}
	static boolean find(String s, char ch, int i) {
		if(i >= s.length()) return false;
		if(s.charAt(i) == ch)
			return true;
		else
			return find(s, ch, i + 1);
	}

}
