package lists.stack;

import java.util.Stack;

public class postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "231*+9-";
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '*' || S.charAt(i) == '/' || S.charAt(i) == '+' || S.charAt(i) == '-') {
                int a = s.pop();
                int b = s.pop();
                switch(S.charAt(i)) {
                    case '*' :
                        int item1 = b * a;
                        s.push(item1);
                        break;
                    case '/' :
                        int item2 = b / a;
                        s.push(item2);
                        break;
                    case '+' :
                        int item3 = b + a;
                        s.push(item3);
                        break;
                    case '-' :
                        int item4 = b - a;
                        s.push(item4);
                        break;
                }
            } else {
                s.push(S.charAt(i) - '0');
            }
        }
        int output = s.peek();
        System.out.println(output);

	}

}
