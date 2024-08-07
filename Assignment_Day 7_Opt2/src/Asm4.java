import java.util.HashSet;
import java.util.Scanner;

public class Asm4 {
    public static void danhsachmang2khongcomang1(int[] mang1, int[] mang2) {
        HashSet<Integer> setmang1 = new HashSet<>();
        for (int num : mang1) {
            setmang1.add(num);
        }
        System.out.println("Các phần tử có trong mảng 2 không có trong mảng 1: ");
        for (int num : mang2) {
            if (!setmang1.contains(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng 1: ");
        int n1 = scanner.nextInt();
        int[] mang1 = new int[n1];
        System.out.println("Nhập các phần tử của mảng 1: ");
        for (int i = 0; i < n1; i++) {
            mang1[i] = scanner.nextInt();
        }

        System.out.print("Nhập số phần tử của mảng 2: ");
        int n2 = scanner.nextInt();
        int[] mang2 = new int[n2];
        System.out.println("Nhập các phần tử của mảng 2: ");
        for (int i = 0; i < n2; i++) {
            mang2[i] = scanner.nextInt();
        }

        danhsachmang2khongcomang1(mang1, mang2);
    }
}
