// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1
// Assumption - number represented by a2 is greater.

import java.util.*;

public class ArrayDiff {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int array1[] = new int[n1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int array2[] = new int[n2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scn.nextInt();
        }

        int diff[] = new int[n2];
        int carry = 0;
        int i = array1.length - 1;
        int j = array2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int currentDiff = 0;
            // If smaller array is exhausted
            int tempVal = (i >= 0 ? array1[i] : 0);
            if (array2[j] + carry >= tempVal) {
                currentDiff = array2[j] + carry - tempVal;
                carry = 0;
            } else {
                currentDiff = array2[j] + 10 + carry - tempVal;
                carry = -1;
            }
            diff[k] = currentDiff;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index < diff.length && diff[index] == 0) {
            index++;
        }
        while (index < diff.length) {
            System.out.println(diff[index++]);
        }
        scn.close();
    }
}