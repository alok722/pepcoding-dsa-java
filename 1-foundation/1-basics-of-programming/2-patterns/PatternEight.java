// Question: https://pepcoding.com/resources/online-java-foundation/patterns/design-pattern-8-official/ojquestion

import java.util.*;

public class PatternEight {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("	");
            }
            System.out.println("*");
        }
        scn.close();
    }
}
