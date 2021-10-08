// 1. You are given an array of size 'n' and n elements of the same array.
// 2. You are required to find and print all the subArrays of the given array. 
// 3. Each subArray should be space separated and on a separate lines. Refer to sample input and output.

import java.util.*;

public class SubArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "	");
                }
                System.out.println();
            }
        }
        scn.close();
    }
}
