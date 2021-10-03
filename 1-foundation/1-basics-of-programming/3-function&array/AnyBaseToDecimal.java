// 1. You are given a number n.
// 2. You are given a base b. n is a number on base b.
// 3. You are required to convert the number n into its corresponding value in decimal number system.

// 💡 To convert number in decimal, divide the number by 10 and keep the remainder. 
// Now, multiply the remainder by base^0 and add it to the result. 
// In every iteration, reduce the num to num/10 & increase the multiplier by *base i.e. base^1, base^2 and keep adding to result.
// Repeat this until number become zero.

import java.util.*;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueInDecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueInDecimal(int n, int b) {
        // write your code here
        int result = 0;
        int initialMultiplier = 1; // base^0
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            result += rem * initialMultiplier;
            initialMultiplier *= b;
        }
        return result;
    }
}