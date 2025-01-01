package lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sodien = scanner.nextDouble();
        while (sodien <= 0) {
            System.out.println("Nhap sai ! Nhap lai > 0");
            sodien = scanner.nextDouble();

        }
        double tiendien = 0.0;
        if (sodien <= 100) {
            System.out.println("Tien dien: " + sodien * 1000);
        } else {
            tiendien = 100 * 1000 + (sodien - 100) * 1500;
            System.out.println(tiendien);
        }
    }
}
