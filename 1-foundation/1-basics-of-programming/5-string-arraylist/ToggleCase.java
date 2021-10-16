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

// import java.io.*;
// import java.util.*;

// public class Main {

// public static String toggleCase(String str){
// //write your code here
// StringBuilder sb = new StringBuilder(str);

// for(int i = 0; i < sb.length(); i++){
// char ch = sb.charAt(i);

// if(ch >= 'A' && ch <= 'Z'){
// ch = (char)(ch + 'a' - 'A');
// } else {
// ch = (char)(ch + 'A' - 'a');
// }

// sb.setCharAt(i, ch);
// }

// return sb.toString();
// }
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// String str = scn.next();
// System.out.println(toggleCase(str));
// }

// }