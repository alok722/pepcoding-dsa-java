// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
// 3. Take input "num1" and "num2" as the two numbers.
// 4. Print their GCD and LCM.

import java.util.*;

public class GcdAndLcm {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp1 = num1;
        int temp2 = num2;

        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println(num2);
        System.out.println((temp1 * temp2) / num2);
        sc.close();
    }
}
