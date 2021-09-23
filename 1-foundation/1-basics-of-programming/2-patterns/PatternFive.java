// Question: https://pepcoding.com/resources/online-java-foundation/patterns/pattern-type-5-official/ojquestion

import java.util.*;

public class PatternFive {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= (n / 2) - i + 1; j++) {
                System.out.print("	");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*	");
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("	");
            }
            for (int j = 1; j <= n - (2 * i); j++) {
                System.out.print("*	");
            }
            System.out.println();
        }
        scn.close();
    }
}