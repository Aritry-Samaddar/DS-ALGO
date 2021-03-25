package projects;

public class fibboPrime3 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		int n = num.length;
		int a = 0;
		int b = 1;
		int p = 2;
		int l = 0;
		int count = 0;
		int print = 0;
		boolean isPrinted = false;
		System.out.print(b + " ");
		count += 1;
		while(count < n) {
			int result = 0;
			for(int j = 1; j <= p; j++) {
				if(p % j == 0) {
					result += 1;
				}
			}
			if(result == 2) {
				count += 1;
				l = print;
				num[l] = p;
				print += 1;
				isPrinted = true;
			}
			p++;
			if(isPrinted == true) {
				count += 1;
				int c = a + b;
				num[l + 1] = c;
				print += 1;
				a = b;
				b = c;
			}
			isPrinted = false;
		}
		for(int item: num) {
			System.out.print(item + " ");
		}

	}

}
