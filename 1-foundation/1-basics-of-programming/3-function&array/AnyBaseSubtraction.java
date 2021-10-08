// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to subtract n1 from n2 and print the value.

import java.util.*;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getDifference(int b, int n1, int n2) {
        int result = 0;
        int carry = 0;
        int power = 1;

        while (n2 > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            // reducing number
            n1 = n1 / 10;
            n2 = n2 / 10;

            // We have to do digit2 - digit1
            int diff = 0;
            // add (borrow) if any carry is there
            digit2 = digit2 + carry;

            // if digit2 is greater simply subtract and carry diff
            if (digit2 >= digit1) {
                carry = 0;
                diff = digit2 - digit1;
            } else {
                // if digit2 is smaller simply take carry 1 and assign -1 and 1 carry is equal
                // to base add
                carry = -1;
                diff = digit2 + b - digit1;
            }
            result += diff * power;
            power = power * 10;
        }
        return result;
    }
}
