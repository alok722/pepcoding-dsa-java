// Question: https://pepcoding.com/resources/online-java-foundation/patterns/design-pattern-6-official/ojquestion

import java.util.*;

public class PatternSix {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write ur code here
        for (int i = 1; i <= n / 2 + 1; i++) {
            // T1 - *
            for (int j = 1; j <= n / 2 + 2 - i; j++) {
                System.out.print("*	");
            }
            // T2 -
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("	");
            }
            // T3 - *
            for (int j = 1; j <= n / 2 + 2 - i; j++) {
                System.out.print("*	");
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            // T1 - *
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*	");
            }
            // T2 -
            for (int j = 1; j <= n - 2 * i; j++) {
                System.out.print("	");
            }
            // T3 - *
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*	");
            }
            System.out.println();
        }
        scn.close();
    }
}