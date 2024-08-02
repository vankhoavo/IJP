
/*
 * Assignment 1: 
Viết hàm nhập và hàm hiển thị tất cả các giá trị đã nhập vào mảng số nguyên chứa N phần tử (N nhập vào từ bàn phím)
 */
import java.util.Scanner;

public class Asm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] asm1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            asm1[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(asm1[i] + " ");
        }
        System.out.println();
    }
}
