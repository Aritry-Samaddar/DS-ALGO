package loops;
import java.lang.Math;
import java.util.Scanner;
public class Hackerrank {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int s = a;
        for(int i = 0; i < n; i++){
            double result = Math.pow(2,i);
            s += result * b;
            System.out.print(s + " ");
            
        }

	}

}
