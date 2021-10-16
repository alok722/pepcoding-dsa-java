// 1. You are given an ArrayList of positive integers.
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

// Note -> The order of elements should remain same.

// 💡 For removal of elements in ArrayList always run loop in reverse order.

import java.util.*;

public class RemovePrime {

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int div = 2; div * div <= num; div++) {
            if (num % div == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void solution(ArrayList<Integer> al) {
        // Running loop in reverse order
        // If loop is run in forward order, then the index of elements will be changed
        // after removal so some elements will be escaped.
        for (int i = al.size() - 1; i >= 0; i--) {
            int val = al.get(i);
            boolean isThisValPrime = isPrime(val);
            if (isThisValPrime == true) {
                al.remove(i);
            }
        }
        // // If not reverse then decrease i after every removal
        // for (int i = 0; i < al.size(); i++) {
        // int val = al.get(i);
        // boolean isThisValPrime = isPrime(val);
        // if (isThisValPrime == true) {
        // al.remove(i);
        // i--;
        // }
        // }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
        scn.close();
    }

}