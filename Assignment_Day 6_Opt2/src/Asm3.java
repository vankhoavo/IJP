import java.util.Scanner;

public class Asm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập vị trí cần xóa: ");
        int y = scanner.nextInt();

        if (y < 0 || y >= n) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }

        int[] newArr = new int[n - 1];
        System.arraycopy(arr, 0, newArr, 0, y);
        System.arraycopy(arr, y + 1, newArr, y, n - y - 1);

        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] xoaPhanTu(int[] arr, int y) {
        if (y < 0 || y >= arr.length) {
            System.out.println("Vị trí không hợp lệ!");
            return arr;
        }

        for (int i = y; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, newArr.length);

        return newArr;
    }
}
