import java.util.Scanner;

public class Asm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = { 2, 4, 6, 3, 8, 10, 23, 76, 34, 74, 13, 84, 92, 19, 10, 23, 2, 6, 6, 6, 6, 6, 76, 76, 1, 0 };
        System.out.print("Nhập x: ");
        int x = scanner.nextInt();

        int count1 = 0;
        int count2 = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                count1++;
            }
        }
        System.out.println("Giá trị " + x + " đã hiển thị " + count1 + " lần trong mảng A");
        System.out.println("Giá trị không có xuất hiện trong mảng A là: " + count2);
    }
}
