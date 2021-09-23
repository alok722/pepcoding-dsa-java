// 1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
// 2. Take as input a number n, representing the number of bulbs.
// 3. Print all the bulbs that will be on after the nth fluctuation in voltage.

//  Perfect square have odd numbers of factors that is why only perfect squares bulbs will stay ON.
// Eg: 24 -> 1*24, 2*12, 3*8, 4*6, after this it will repeat itself, So 2n
// Eg: 36 -> 1*36, 2*18, 3*12, 4*9, 6*6, after this it will repeat itself, So (2n+1)

// Question: https://pepcoding.com/resources/online-java-foundation/getting-started/benjamin-bulbs-official/ojquestion

import java.util.*;

public class BenjaminBulbs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i * i <= num; i++) {
            System.out.println(i * i);
        }
        sc.close();
    }
}
