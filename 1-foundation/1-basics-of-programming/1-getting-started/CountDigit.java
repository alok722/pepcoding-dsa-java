// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

// A Number can tolerate number of division by 10 is equal to the number of digits in the number.

import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.print(count);
        sc.close();
    }
}
