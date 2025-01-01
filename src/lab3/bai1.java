package lab3;

import java.lang.Math;
import java.util.Scanner;

public class bai1 {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n = nhap.nextInt();
        if (isPrime(n)) {
            System.out.println("NGUYEN TO");

        } else {
            System.out.println("Khong nguyen To");
        }
        nhap.close();
    }
}
