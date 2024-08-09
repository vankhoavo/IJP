import java.util.Scanner;

public class Asm1cach2 {

    public static boolean linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = { 2, 4, 5, 6, 7, 8, 9, 13, 31, 12, 21, 34, 43, 54, 45, 75, 56, 46, 83 };

        System.out.println("Nhập phần tử X: ");
        int x = scanner.nextInt();

        boolean found = linearSearch(A, x);

        if (found) {
            System.out.println("Giá trị " + x + " có tồn tại trong mảng A");
        } else {
            System.out.println("Giá trị " + x + " không tồn tại trong mảng A");
        }
    }
}
