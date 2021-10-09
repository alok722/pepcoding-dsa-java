import java.util.*;

public class SpiralDisplay {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int top = 0;
        int left = 0;
        int down = arr.length - 1;
        int right = arr[0].length - 1;
        int dir = 0;
        int i;
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (i = top; i <= down; i++) {
                    System.out.println(arr[i][left]);
                }
                left++;
            }
            if (dir == 1) {
                for (i = left; i <= right; i++) {
                    System.out.println(arr[down][i]);
                }
                down--;
            }
            if (dir == 2) {
                for (i = down; i >= top; i--) {
                    System.out.println(arr[i][right]);
                }
                right--;
            }
            if (dir == 3) {
                for (i = right; i >= left; i--) {
                    System.out.println(arr[top][i]);
                }
                top++;
            }
            dir = (dir + 1) % 4;
        }
    }
}