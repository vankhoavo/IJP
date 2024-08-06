import java.util.ArrayList;
import java.util.Scanner;

public class Asm3 {
    public static void main(String[] args) {
        ArrayList<Integer> danhSach = Asm2.nhapchuoi();
        laygiatri(danhSach);
    }

    public static void laygiatri(ArrayList<Integer> nhapchuoi) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí x: ");
        int x = scanner.nextInt();
        if (x >= 0 && x < nhapchuoi.size()) {
            System.out.println("Giá trị tại vị trí " + x + " là: " + nhapchuoi.get(x));
        } else {
            System.out.println("Vị trí không hợp lệ");
        }
    }
}
