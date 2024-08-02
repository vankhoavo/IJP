/*
 * Viết hàm chứa các giá trị CHẴN trong mảng số nguyên A chứa N phần tử (N nhập vào từ bàn phím) vào mảng số nguyên CHẴN B. 
 * Các giá trị của mảng A được nhập từ hàm đã viết ở Bài 1.
 */

import java.util.Scanner;

public class Asm4 {
    public static void nhapphantu(int[] mang, int n, int[] count) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập các phần tử: " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
            if (mang[i] % 2 == 0) {
                count[0]++;
            }
        }
    }

    public static void hienthimangA(int[] mang, int n) {
        System.out.print("Các phần tử trong mảng A: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    public static void luumangAsangmangB(int[] mang, int[] mangB, int n, int[] count) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                mangB[index] = mang[i];
                index++;
            }
        }
    }

    public static void hienthimangB(int[] mangB, int ptchan) {
        System.out.print("Các phần tử trong mảng B: ");
        for (int i = 0; i < ptchan; i++) {
            System.out.print(mangB[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n các phần tử: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        int[] count = { 0 };
        nhapphantu(mang, n, count);
        hienthimangA(mang, n);
        int[] mangB = new int[count[0]];
        luumangAsangmangB(mang, mangB, n, count);
        hienthimangB(mangB, count[0]);
    }
}
