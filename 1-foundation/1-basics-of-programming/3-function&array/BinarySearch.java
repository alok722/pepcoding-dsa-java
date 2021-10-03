import java.util.*;

public class BinarySearch {
    public static void main() {
        // Input Array
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        // Input Key
        int key = sc.nextInt();

        // Binary Search
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + index);
        }
        sc.close();
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key < arr[mid]) {
                // right side is useless, discard it
                right = mid - 1;
            } else if (key > arr[mid]) {
                // left side is useless, discard it
                left = mid + 1;
            } else {
                // found
                return mid;
            }
        }
        return -1;
    }
}