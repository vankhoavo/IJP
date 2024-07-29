import java.util.Scanner;

public class Asm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baikiemtra;
        int diemgiuaky;
        int diemcuoiky;
        int tong;
        System.out.print("Nhập điểm bài kiểm tra: ");
        baikiemtra = sc.nextInt();
        System.out.print("Nhập điểm giữa kỳ: ");
        diemgiuaky = sc.nextInt();
        System.out.print("Nhập điểm cuối kỳ: ");
        diemcuoiky = sc.nextInt();
        if (baikiemtra <= 100 && diemcuoiky <= 100 && diemcuoiky <= 100) {
            tong = (baikiemtra + diemcuoiky + diemgiuaky) / 3;
            System.out.println("Điểm tổng trung bình: " + tong);
            if (tong >= 90) {
                System.out.println("Điểm A");
            } else if (tong >= 70 && tong < 90) {
                System.out.println("Điểm B");
            } else if (tong >= 50 && tong <= 70) {
                System.out.println("Điểm C");
            } else {
                System.out.println("Điểm F");
            }
        } else {
            System.out.println("Không thể tính được, bởi vì bắt buộc thang điểm nhỏ hơn hoặc bằng 100");
        }
    }
}
