import java.util.Scanner;

public class Asm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("Hãy nhập 1 số đầu vào: ");
        a = sc.nextDouble();
        if (a % 2 == 0) {
            System.out.println("Số Chẵn");
        } else {
            System.out.println("Số Lẻ");
        }
    }
}