// You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
// You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

// shell-rotate

// You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
// You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

import java.util.*;

public class RingRotate {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Which shell to rotate?
        int s = sc.nextInt();
        // How many time?
        int r = sc.nextInt();
        rotateShell(arr, s, r);
        display(arr);
        sc.close();
    }

    public static void rotateShell(int[][] arr, int s, int r) {
        // Extract OneD Array
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }

    public static int[] fillOnedFromShell(int[][] arr, int s) {
        // if Shell = 3, then Box TopLeft = S-1, S-1, Box BottomDown = arr.length-S
        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = arr.length - s;
        int maxCol = arr[0].length - s;
        // corners are getting repetitive so -4
        // leftWall + bottomWall + rightWall + topWall
        // int size = (2 * (maxRow - minRow + 1)) + (2 * (maxCol - minCol + 1)) - 4;
        int size = 2 * (maxRow - minRow + maxCol - minCol);
        int[] oned = new int[size];

        // leftWall
        int idx = 0;
        for (int i = minRow, j = minCol; i <= maxRow; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // bottomWall
        for (int i = maxRow, j = minCol + 1; j <= maxCol; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // rightWall
        for (int i = maxRow - 1, j = maxCol; i >= minRow; i--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // topWall
        for (int i = minRow, j = maxCol - 1; j >= minCol + 1; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;
    }

    public static void rotate(int[] oned, int r) {
        r = r % oned.length;
        if (r < 0)
            r += oned.length;
        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int[] oned, int li, int ri) {
        while (li < ri) {
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
        // if Shell = 3, then Box TopLeft = S-1, S-1, Box BottomDown = arr.length-S
        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = arr.length - s;
        int maxCol = arr[0].length - s;

        // leftWall
        int idx = 0;
        for (int i = minRow, j = minCol; i <= maxRow; i++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // bottomWall
        for (int i = maxRow, j = minCol + 1; j <= maxCol; j++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // rightWall
        for (int i = maxRow - 1, j = maxCol; i >= minRow; i--) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // topWall
        for (int i = minRow, j = maxCol - 1; j >= minCol + 1; j--) {
            arr[i][j] = oned[idx];
            idx++;
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