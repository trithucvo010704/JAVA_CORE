package lab2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Pt can gia la AX + B = 0
        if (a == 0 && b == 0) {
            System.out.println("Phương Trình Có Vô Số Nghiệm");
        } else if (a == 0 && b != 0) {
            System.out.println(" Phương Trình Vô Nghiệm");
        } else {
            double x = (-b / (1.0 * a));
            System.out.println(x);
        }
        scanner.close();
    }
}
