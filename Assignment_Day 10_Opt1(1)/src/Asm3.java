import java.util.Scanner;

public class Asm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 4 };
        System.out.print("Nhập giá trị x: ");
        int x = scanner.nextInt();
        String n = " ";

        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                n = n + i + " ";
            }
        }
        if (!n.isEmpty()) {
            System.out.println("Giá trị " + x + " xuất hiện tại các vị trí: " + n);
        } else {
            System.out.println("Giá trị " + x + " không tồn tại trong mảng");
        }
    }
}
