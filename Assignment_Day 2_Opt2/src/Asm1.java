import java.util.Scanner;

public class Asm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        System.out.println("Phép cộng: " + (a + b));
        System.out.println("Phép trừ: " + (a - b));
        System.out.println("Phép nhân: " + (a * b));
        if (b != 0) {
            System.out.println("Phép chia: " + (a / b));
        } else {
            System.out.println("Không thể chia được");
        }
    }
}
