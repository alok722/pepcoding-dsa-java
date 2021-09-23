// Question: https://pepcoding.com/resources/online-java-foundation/patterns/design-pattern-11-official/ojquestion

import java.util.*;

public class PatternEleven {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write ur code here
        int nst = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(val + "	");
                val++;
            }
            System.out.println();
            nst++;
        }
        scn.close();
    }
}
