import java.util.Scanner;

public class Asm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        int phep_tinh;
        System.out.println("Phép cộng: " + (phep_tinh = a + b));
        System.out.println("Phép trừ: " + (phep_tinh = a - b));
        System.out.println("Phép nhân: " + (phep_tinh = a * b));
        if (b != 0) {
            System.out.println("Phép chia: " + (phep_tinh = a / b));
        } else {
            System.out.println("Không chia được");
        }

    }
}
