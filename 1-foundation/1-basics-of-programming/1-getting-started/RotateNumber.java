// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340

// Sample Input: 
// 562984
// 2
// Sample Output: 845629

import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        // Rotation is going to repeat itself after DigitCount
        k = k % count;

        // If K is negative, then we need to rotate to the left instead we are rotating
        // to the right more number of times
        if (k < 0)
            k = k + count;
        while (k != 0) {
            int rem = num % 10;
            int quot = num / 10;
            num = rem * (int) Math.pow(10, count - 1) + quot;
            k--;
        }
        System.out.print(num);
        sc.close();
    }
}
