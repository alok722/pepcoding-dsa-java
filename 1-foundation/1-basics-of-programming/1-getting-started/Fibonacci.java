/*
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.
*/

// Question: https://pepcoding.com/resources/online-java-foundation/getting-started/fibonacci-till-n-official/ojquestion

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        // write your code here
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
