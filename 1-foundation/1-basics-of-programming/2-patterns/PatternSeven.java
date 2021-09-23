// Question: https://pepcoding.com/resources/online-java-foundation/patterns/design-pattern-7-official/ojquestion

import java.util.*;

public class PatternSeven {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("	");
            }
            System.out.println("*");
        }
        scn.close();
    }
}