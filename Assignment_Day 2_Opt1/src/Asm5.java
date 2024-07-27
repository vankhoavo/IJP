import java.util.Scanner;

public class Asm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhập số nguyên a: ");
        a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        b = sc.nextInt();
        System.out.println("Giá trị ban đầu của 2 số nguyên là: " + "a = " + a + "," + " b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Giá trị đảo ngược của 2 số nguyên là: " + "a = " + a + "," + " b = " + b);
    }
}
