import java.util.ArrayList;
import java.util.Scanner;

public class Asm4 {
    public static void main(String[] args) {
        ArrayList<Integer> chuoi = Asm2.nhapchuoi();
        System.out.println("Mảng cũ có giá trị sau: " + chuoi + " ");
        updategiatri(chuoi);
    }

    public static void updategiatri(ArrayList<Integer> changegiatri) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí x: ");
        int x = scanner.nextInt();
        if (x >= 0 && x < changegiatri.size()) {
            System.out.print("Nhập giá trị mới: ");
            int giatrimoi = scanner.nextInt();
            changegiatri.set(x, giatrimoi);
            System.out.println("Mảng mới có giá trị sau: " + changegiatri + " ");
        } else {
            System.out.println("Không có chỉ số hợp lệ");
        }
    }
}
