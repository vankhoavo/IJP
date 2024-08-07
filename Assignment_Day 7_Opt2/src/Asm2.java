
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Asm2 {
    private static int[] mang1;
    private static int[] mang2;

    public static void nhapmang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng m1 cần nhập: ");
        int m1 = scanner.nextInt();
        int[] mang1 = new int[m1];
        System.out.print("Nhập số lượng phần tử trong mảng m2 cần nhập: ");
        int m2 = scanner.nextInt();
        int[] mang2 = new int[m2];
        for (int i = 0; i < m1; i++) {
            System.out.print("Mảng 1 nhập giá trị phần tử " + (i + 1) + " là: ");
            mang1[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < m2; i++) {
            System.out.print("Mảng 2 nhập giá trị phần tử " + (i + 1) + " là: ");
            mang2[i] = scanner.nextInt();
        }
    }

    public static boolean checkmang(int[] mang1, int[] mang2) {
        return Arrays.equals(mang1, mang2);
    }

    public static void main(String[] args) {
        Asm2.nhapmang();
        boolean result = checkmang(mang1, mang2);
        if (result) {
            System.out.println("2 danh sách mảng này là bằng nhau");
        } else {
            System.out.println("2 danh sách mảng này là không bằng nhau");
        }
    }
}