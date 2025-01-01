package java_Core1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhap vo hai so thuc la chieu dai va rong cua HCN
        System.out.print("Nhap 2 canh a , b  :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double dientich = a * b;
        double chuvi = (a + b) * 2;
        double canh_min = Math.min(a, b);
        System.out.println("Dien tich Cua hinh chu Nhat la :" + (int) dientich);
        System.out.println("Chu Vi Cua hinh chu Nhat la :" + chuvi);
        System.out.println("Canh Min Cua hinh chu Nhat la :" + canh_min);

        scanner.close();
    }
}
