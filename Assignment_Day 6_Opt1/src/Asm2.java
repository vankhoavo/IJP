
/*
 * Assignment 2:
Viết hàm sinh ra N giá trị số nguyên bất kỳ cho mảng và hiển thị các giá trị trong mảng ra màn hình (N nhập vào từ bàn phím).
 */
import java.util.Random;
import java.util.Scanner;

public class Asm2 {
    static int[] asm2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhập số n phần tử của mảng: ");
        int n = scanner.nextInt();
        asm2 = new int[n];
        for (int i = 0; i < n; i++) {
            asm2[i] = rd.nextInt(n);
        }

        System.out.print("Các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(asm2[i] + " ");
        }
        System.out.println();
    }
}
