//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = number; i > 2; i--) {
            if (isPrime(i)) {
                if (number % i == 0) {
                    return i;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(getLargestPrime(number));
    }
}