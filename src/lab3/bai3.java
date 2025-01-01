package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static int[] Merge_Sort(int[] a) {
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);// Phuong thuc array co the truyen object
        System.out.println("Mang sau khi sx " + java.util.Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[n - 1]);
        scanner.close();
    }
}