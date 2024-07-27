import java.util.Scanner;

public class Asm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhập số tuổi của bạn vào: ");
        a = sc.nextInt();
        System.out.println("Năm nay bạn " + a + " tuổi");
        if(a>=18){
            System.out.println("Bạn đủ điều kiện để bỏ phiếu");
        }else {
            System.out.println("Bạn không đủ điều kiện để bỏ phiếu");
        }
    }
}
