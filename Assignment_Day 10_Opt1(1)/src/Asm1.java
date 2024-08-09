import java.util.Scanner;

public class Asm1 {
    public static void main(String[] args) {
        int[] A = { 2, 4, 6, 3, 8, 10, 23, 76, 34, 74, 13, 84, 92, 19 };
        int x = nhapmang();

    }

    public static int nhapmang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị X: ");
        int x = scanner.nextInt();
        return x;
    }

    public static boolean found(int[] A, int x) {
        boolean found = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Giá trị phần " + x + " có tồn tại trong mảng A");
        } else {
            System.out.println("Giá trị phần tử " + x + " không tồn tại trong mảng A");
        }
        return found;
    }
}