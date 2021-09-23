// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

// Sample Input: 65784383
// Sample Output: 38384367

// Question: https://pepcoding.com/resources/online-java-foundation/getting-started/reverse-a-number-official/ojquestion

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }
        sc.close();
    }
}
