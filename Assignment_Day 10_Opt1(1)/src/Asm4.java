import java.util.Scanner;

public class Asm4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int x;
        int y;
        int count = 0;

        do {
            System.out.print("Nhập giá trị X: ");
            x = scanner.nextInt();
            System.out.print("Nhập giá trị Y: ");
            y = scanner.nextInt();
            if (x < y) {
                break;
            } else {
                System.out.println("Vui lòng nhập lại");
            }
        } while (x > y);

        boolean pt = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= x && A[i] <= y) {
                count++;
                pt = true;
            }
        }

        if (pt) {
            System.out.println("Giá trị của A đã nhập từ " + x + " đến " + y + " chứa " + count + " phần tử");
        } else {
            System.out.println("-1");
        }
    }
}
