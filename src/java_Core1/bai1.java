package java_Core1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten cua ban : ");
        String name = scanner.nextLine();
        System.out.print("Nhap diem cua ban cua ban : ");
        double diem = scanner.nextDouble();
        System.out.println("Ten cua ban : " + name + " Diem TB cua ban :" + Math.round(diem));
        scanner.close();
    }
}
