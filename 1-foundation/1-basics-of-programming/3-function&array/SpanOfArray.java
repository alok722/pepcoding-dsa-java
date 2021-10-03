// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

import java.util.*;

public class SpanOfArray {

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
        // Finding Minimum
        int min = arr[0];
        for (int k = 0; k < arrSize; k++) {
            if (arr[k] < min) {
                min = arr[k];
            }
        }
        // Calculating Spam
        System.out.print(max - min);
        sc.close();
    }

}
