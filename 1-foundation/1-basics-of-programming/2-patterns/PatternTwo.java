// Question Link: https://pepcoding.com/resources/online-java-foundation/patterns/pattern-type-2-official/ojquestion

import java.util.*;

public class PatternTwo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + "	");
            }
            System.out.println("");
        }
        scn.close();
    }
}
