// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print a bar chart representing value of arr a.

import java.util.*;

public class BarChart {

    public static void main(String[] args) throws Exception {
        // Input Array
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        // Finding Maximum
        int max = arr[0];
        for (int j = 0; j < arrSize; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        // 💡 Draw Pattern, Imagine it be like buildings with max being the tallest
        // building.
        // Start iterating, if elem match the height print * else space.
        // decrease height in each iteration
        for (int height = max; height >= 1; height--) {
            for (int i = 0; i < arrSize; i++) {
                if (arr[i] >= height) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}