import java.io.*;
import java.util.*;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = factorial(n);
        System.out.print(sum);
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}