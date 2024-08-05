import java.util.ArrayList;
import java.util.Scanner;

public class Asm2 {
    public static ArrayList<Integer> nhapchuoi() {
        ArrayList<Integer> nhapchuoi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử cần nhập: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập các phần tử cần thêm " + (i + 1) + ": ");
            int songuyen = scanner.nextInt();
            nhapchuoi.add(songuyen);
        }
        return nhapchuoi;
    }

    public static void hienthi() {
        ArrayList<Integer> nhapchuoi2 = nhapchuoi();
        System.out.print("\nCác phần tử đã nhập: ");
        System.out.println(nhapchuoi2);
    }

    public static void main(String[] args) {
        Asm2 bt = new Asm2();
        bt.hienthi();
    }
}
