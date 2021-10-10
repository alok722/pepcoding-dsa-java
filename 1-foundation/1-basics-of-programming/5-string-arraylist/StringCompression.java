// 1. You are given a string. 
// 2. You have to compress the given string in the following two ways - 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".

import java.util.*;

public class StringCompression {
    public static String compression1(String str) {
        // write your code here
        String ans = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                // nothing
            } else {
                ans += str.charAt(i);
            }
        }
        ans += str.charAt(str.length() - 1);
        return ans;
    }

    public static String compression2(String str) {
        // write your code here
        String ans = "";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                ans += str.charAt(i);
                if (count > 1)
                    ans += count;
                count = 1;
            }
        }
        ans += str.charAt(str.length() - 1);
        if (count > 1)
            ans += count;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        scn.close();
    }
}