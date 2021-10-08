// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the arrays.

import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        while (k >= 0) {
            int digit = carry;
            if (i >= 0) {
                digit += arr1[i];
                i--;
            }
            if (j >= 0) {
                digit += arr2[j];
                j--;
            }
            // after summation if num > 10, then remainder will be added to result array and
            // carry will be set to quotient
            sum[k] = digit % 10;
            carry = digit / 10;
            k--;
        }
        if (carry != 0) {
            System.out.println(carry);
        }
        for (int val : sum) {
            System.out.println(val);
        }
        scanner.close();
    }
}
