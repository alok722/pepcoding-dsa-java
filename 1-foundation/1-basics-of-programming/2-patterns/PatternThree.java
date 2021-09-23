// Question: https://pepcoding.com/resources/online-java-foundation/patterns/pattern-type-3-official/ojquestion

import java.util.*;

public class PatternThree {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("" + "	");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + "	");
            }
            System.out.println("");
        }
        scn.close();
    }
}
