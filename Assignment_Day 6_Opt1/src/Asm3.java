
/*
Assignment 3:
Viết hàm hiển thị các giá trị chẵn trong mảng số nguyên chứa N phần tử (N nhập vào từ bàn phím). 
Các giá trị của mảng được nhập từ hàm đã viết ở Bài 1.
 */
import java.util.Scanner;

public class Asm3 {
    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
    }

    public static void hienThiMang(int[] mang, int n) {
        System.out.print("Các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    public static void hienThiGiaTriChan(int[] mang, int n) {
        System.out.print("Các phần tử chẵn trong mảng: ");
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                System.out.print(mang[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        hienThiMang(mang, n);
        hienThiGiaTriChan(mang, n);
    }
}
