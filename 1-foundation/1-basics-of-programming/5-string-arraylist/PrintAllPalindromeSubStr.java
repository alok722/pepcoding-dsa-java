// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.

import java.util.*;

public class PrintAllPalindromeSubStr {
	public static void solution(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				boolean isPalindrome = isPalindrome(sub);
				if (isPalindrome)
					System.out.println(sub);
			}
		}

	}

	public static boolean isPalindrome(String sub) {
		boolean flag = true;
		int left = 0;
		int right = sub.length() - 1;
		while (left < right) {
			char charAtLeft = sub.charAt(left);
			char charAtRight = sub.charAt(right);
			if (charAtLeft != charAtRight) {
				flag = false;
				break;
			}
			left++;
			right--;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solution(str);
		scn.close();
	}
}