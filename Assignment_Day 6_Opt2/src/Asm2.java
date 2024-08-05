import java.util.Scanner;

public class Asm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử cần thêm: ");
        int x = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm: ");
        int y = scanner.nextInt();

        if (y < 0 || y > n) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        int[] newArr = new int[n + 1];
        System.arraycopy(arr, 0, newArr, 0, y);
        newArr[y] = x;
        System.arraycopy(arr, y, newArr, y + 1, n - y);
        System.out.print("Mảng sau khi thêm: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
