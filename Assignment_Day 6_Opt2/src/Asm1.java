import java.util.Random;
import java.util.Scanner;

public class Asm1 {
    public static void tinhTong(int[] mang, int n, int sum) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            mang[i] = rd.nextInt(n);
            System.out.print(mang[i] + " ");
            sum += mang[i];
        }
        System.out.print("\nTổng các số nguyên bất kỳ: " + sum);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập n của mảng: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        int sum = 0;
        tinhTong(mang, n, sum);
    }
}