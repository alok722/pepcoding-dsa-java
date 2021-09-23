
// 1. You are required to display the prime factorization of a number.
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

// Question: https://pepcoding.com/resources/online-java-foundation/getting-started/prime-factorisation-official/ojquestion

import java.util.*;

public class PrimeFactorization {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i * i < num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        if (num > 1)
            System.out.print(num);
        sc.close();
    }
}