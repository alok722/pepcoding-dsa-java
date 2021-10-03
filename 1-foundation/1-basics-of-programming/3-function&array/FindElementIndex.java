// 1.You are given a number n, representing the size of array a.
// 2.You are given n distinct numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

import java.util.*;

public class FindElementIndex {
    public static void main(String[] args) throws Exception {
        // Input Array
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        int toSearch = sc.nextInt();
        int result = -1;
        for (int j = 0; j < arrSize; j++) {
            if (arr[j] == toSearch) {
                result = j;
                break;
            }
        }
        sc.close();
        System.out.print(result);
    }

}
