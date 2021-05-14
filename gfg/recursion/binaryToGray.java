// Function to change Binary to
    // Gray using recursion
package gfg.recursion;
import static java.lang.StrictMath.pow;
public class binaryToGray {
	// Function to change Binary to
    // Gray using recursion
    int binary_to_gray(int n, int i)
    {
        int a, b;
        int result = 0;
        if (n != 0)
        {
            // Taking last digit
            a = n % 10;
             
            n = n / 10;
             
            // Taking second last digit
            b = n % 10;
         
            if ((a & ~ b) == 1 || (~ a & b) == 1)
            {
                result = (int) (result + pow(10,i));
            }
             
            return binary_to_gray(n, ++i) + result;
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int binary_number;
        int result = 0;
        binary_number = 1011101;
         
        binaryToGray obj = new binaryToGray();
        result = obj.binary_to_gray(binary_number,0);
         
        System.out.print(result);
    }
/*Algorithm*/
/*binary_to_grey(n)
 if n == 0
       grey = 0;
 else if last two bits are opposite  to each other
       grey = 1 + 10 * binary_to_gray(n/10))
 else if last two bits are same
       grey = 10 * binary_to_gray(n/10))*/
}
