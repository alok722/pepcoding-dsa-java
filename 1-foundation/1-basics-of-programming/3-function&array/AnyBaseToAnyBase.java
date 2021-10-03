// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.

// 💡 Note: First convert to Decimal and then convert to any base.

import java.util.*;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int numberInDecimal = convertToDecimal(n, sourceBase);
        int numberInDestinationBase = decimalToAnyBase(numberInDecimal, destBase);
        System.out.print(numberInDestinationBase);
        scn.close();
    }

    public static int convertToDecimal(int n, int b) {
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

    public static int decimalToAnyBase(int n, int b) {
        int multiplier = 1; // 10^0 = 1;
        int result = 0;
        while (n != 0) {
            int rem = n % b;
            n = n / b;
            // Add the remainder to the result after multiplying it with the multiplier(to
            // get result in reverse)
            result += rem * multiplier;
            multiplier *= 10;
        }
        return result;
    }
}
