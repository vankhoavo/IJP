import java.util.ArrayList;
import java.util.Scanner;

public class Asm5 {
    public static void main(String[] args) {
        ArrayList<Integer> danhSach = Asm2.nhapchuoi();
        System.out.println("Mảng cũ có giá trị sau: " + danhSach + " ");
        removephantu(danhSach);
    }

    public static void removephantu(ArrayList<Integer> removePhanTu) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử x: ");
        int x = scanner.nextInt();
        if (x >= 0 && x < removePhanTu.size()) {
            removePhanTu.remove(x);
            System.out.println("Mảng mới có giá trị: " + removePhanTu);
        } else {
            System.out.println("Chỉ số phần tử không hợp lệ");
        }
    }
}
