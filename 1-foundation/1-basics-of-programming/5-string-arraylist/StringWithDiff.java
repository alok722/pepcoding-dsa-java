// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1;
//    'e'-'b' = 3;
//    'c'-'e' = -2;
//    'd'-'c' = 1;

import java.util.*;

public class StringWithDiff {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // If last character
            if (i == str.length() - 1) {
                char chi = str.charAt(i);
                sb.append(chi);
            } else {
                char chi = str.charAt(i);
                char chip1 = str.charAt(i + 1);
                sb.append(chi);
                sb.append(chip1 - chi);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
        scn.close();
    }

}