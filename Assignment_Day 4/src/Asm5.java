import java.util.Scanner;

public class Asm5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào giá trị n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int value;
            if (i % 2 == 0) {
                value = i * 2 * -1;
            } else {
                value = i * 2;
            }
            if (i == n) {
                System.out.print(value);
            } else {
                System.out.print(value + ", ");
            }
        }
    }
}
