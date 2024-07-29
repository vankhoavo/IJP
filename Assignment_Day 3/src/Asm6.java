import java.util.Scanner;

public class Asm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Câu hỏi: Cách chính xác để khai báo một biến để lưu trữ một giá trị số nguyên trong Java là gì?");
        System.out.println("a: int 1x = 10");
        System.out.println("b: int x = 10");
        System.out.println("c: float x = 10.0f");
        System.out.println("d: chuỗi x = " + 10);
        System.out.print("Nhập sự lựa chọn: ");

        // Cách 1
        char result;
        result = sc.next().charAt(0);
        if (result == 'b') {
            System.out.println("Bạn đã chọn đúng đáp án");
        } else if (result == 'a' || result == 'c' || result == 'd') {
            System.out.println("Bạn đã chọn sai đáp án");
        } else {
            System.out.println("Câu trả lời chỉ được nằm trong sự lựa chọn a, b, c, d");
        }

        // Cách 2
        String bc;
        bc = sc.nextLine();
        if (bc.equals("B")) {
            System.out.println("Bạn đã chọn đúng đáp án");
        } else if (bc.equals("A") || bc.equals("C") || bc.equals("D")) {
            System.out.println("Bạn đã chọn sai đáp án");
        } else {
            System.out.println("Câu trả lời chỉ được nằm trong sự lựa chọn a, b, c, d");
        }
    }
}