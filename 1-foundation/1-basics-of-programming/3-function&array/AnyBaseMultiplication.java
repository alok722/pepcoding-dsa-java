import java.util.*;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getProduct(int b, int n1, int n2) {
        // power is to form result by extending single digit aka align
        int p = 1;
        int result = 0;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int singleProduct = getProductWithSingleDigit(b, n1, d2);
            result = getSum(b, result, singleProduct * p);
            p = p * 10;
        }
        return result;
    }

    public static int getProductWithSingleDigit(int b, int n1, int d2) {
        // In loop extract single digit of n1 & multiply with d2
        int result = 0;
        int carry = 0;
        int power = 1;

        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + carry;
            carry = d / b;
            d = d % b;

            result += d * power;
            // Power is to form result
            power *= 10;
        }
        return result;
    }

    // 💡 if base is 8 and on addition, 10 comes up then its Q: 1, R: 2
    public static int getSum(int b, int n1, int n2) {
        int result = 0;
        int sum = 0, carry = 0, multiplier = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            sum = (digit1 + digit2 + carry);
            carry = sum / b;
            int value = sum % b;

            result += multiplier * value;
            // increase multiplier to print the number
            multiplier *= 10;

            n1 /= 10;
            n2 /= 10;
        }
        return result;
    }
}