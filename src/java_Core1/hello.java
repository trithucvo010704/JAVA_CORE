package java_Core1;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap so nguyen A :  ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = Math.max(a, b);
		System.out.println("So nguyen toi co la :" + c);
		scanner.close();
	}
}
