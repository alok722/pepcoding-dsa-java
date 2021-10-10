// 1. You are given a number n, representing the number of rows and number of columns.
// 2. You are given n*n numbers, representing elements of 2d array a.
// 3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
// *Note - you are required to do it in-place i.e. no extra space should be used to achieve it .* 

import java.util.*;

public class RotateMatrix {
    public static void main(String[] args) throws Exception {
        // write your code here
        // 1st Row -> Last column
        // 2nd Row -> 2nd last Column and so on...
        // Transpose: 1st Row -> 1st Column and so on...
        // 💡 First Transpose then Reverse Column
        // How to reverse column? - reverse row by row will result in reversed column
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotateBy90(arr);
        display(arr);
        sc.close();
    }

    public static void rotateBy90(int[][] arr) {
        // transpose - moving in upper Triangle only.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse columns i.e row by row
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[0].length - 1;
            while (li <= ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
