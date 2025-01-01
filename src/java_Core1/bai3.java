package java_Core1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double thetich = Math.pow(a, 3);
        float check = 1e3f;
        System.out.println((int) thetich);
        System.out.println(check);
        scanner.close();

    }
}
