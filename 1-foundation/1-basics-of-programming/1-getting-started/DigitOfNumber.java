// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

// Sample Input: 65784383
// Sample Output: 
// 6
// 5
// 7
// 8
// 4
// 3
// 8
import java.util.*;

public class DigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        // Counting number of digits in the number
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        // Calculating divisor, if DigitCount is 5 then we will divide num by 10^4 to
        // get the first digit
        int div = (int) Math.pow(10, count - 1);
        while (div != 0) {
            System.out.println(num / div);
            num = num % div;
            div = div / 10;
        }
        sc.close();
    }
}
