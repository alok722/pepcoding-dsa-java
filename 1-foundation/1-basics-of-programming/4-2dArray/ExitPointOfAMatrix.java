// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

import java.util.*;

public class ExitPointOfAMatrix {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Have to start from (0,0) toward East
        int dir = 0; // 0 - East, 1 - South, 2 - West, 3 - North
        int i = 0;
        int j = 0;
        while (true) {
            // If value is != 0 then we have to take turn so changing dir
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) {
                // East - Move in the same row
                j++;
            } else if (dir == 1) {
                // South - Move down the column
                i++;
            } else if (dir == 2) {
                // West - Move backwards in the row
                j--;
            } else if (dir == 3) {
                // North - Move up the column
                i--;
            }
            // To break loop if I am out of matrix
            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
        sc.close();
    }
}