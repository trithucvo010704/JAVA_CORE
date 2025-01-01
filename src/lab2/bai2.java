package lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        /// Giai pt bac 2
        double d = 0;
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("PT VSN");
            } else if (b == 0 && c != 0) {
                System.out.println("PT VN");
            } else {
                double x1 = (c / (1.0 * b));
                System.out.println(x1);
            }
        } else {
            d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {
                System.out.println("PT VN ");

            } else if (d == 0) {
                double kep = -b / (2 * a * 1.0);
                System.out.println(" Nghiem kep : " + kep);

            } else {
                System.out.println("2 NO PHAN BIET! ");
                double x1 = (-b + Math.sqrt(d)) / 1.0 * 2 * a;
                double x2 = (-b - Math.sqrt(d)) / 1.0 * 2 * a;
                System.out.println(" 2 NO LA  X1 " + x1 + " X2 " + x2);
            }
        }
        scanner.close();
    }
}
