import java.util.Scanner;

public class Asm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhấp số: ");
        char key = sc.next().charAt(0);
        switch (key) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("Bạn đã nhấn vào số " + key);
                break;
            default:
                System.out.println("Không được phép");
                break;
        }
    }
}
