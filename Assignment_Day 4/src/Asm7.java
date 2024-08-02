import java.util.Scanner;

public class Asm7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int value;
            value = i * 2;
            if (i == n) {
                System.out.print(value);
            } else {
                System.out.print(value + ", ");
            }
        }
    }
}
