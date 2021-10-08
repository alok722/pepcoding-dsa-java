// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to the left for negative values of k.

import java.io.*;

public class RotateArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int li, int ri) {
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int[] a, int k) {
        // After a length rotation result will be same
        k = k % a.length;
        // If negative, we will handle with positive value
        if (k < 0) {
            k += a.length;
        }
        // Break into two part, P1 & P2
        // Reverse P1 & P2 separately
        // Now do overall reverse of resultant
        // Eg: 1 2 3 4 5 6 7 8, k = 3
        // P1 = 1 2 3 4 5 -> P1' = 5 4 3 2 1
        // P2 = 6 7 8 -> P2' = 8 7 6
        // Resultant = 5 4 3 2 1 8 7 6
        // Final Reverse = 6 7 8 1 2 3 4 5

        // Reversing Part 1
        reverse(a, 0, a.length - k - 1);
        // Reversing Part 2
        reverse(a, a.length - k, a.length - 1);
        // Overall reverse
        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        rotate(a, k);
        display(a);
    }
}
