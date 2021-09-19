
import java.util.*;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
        sc.close();
    }
}
