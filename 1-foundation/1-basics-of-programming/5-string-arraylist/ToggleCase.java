// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to toggle the case of every character of the given string.

import java.util.*;

public class ToggleCase {
    public static String toggleCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char temp = str.charAt(i);
                result += Character.toLowerCase(temp);
            } else {
                char temp = str.charAt(i);
                result += Character.toUpperCase(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
        scn.close();
    }
}