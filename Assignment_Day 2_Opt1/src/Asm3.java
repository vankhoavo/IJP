import java.text.DecimalFormat;
import java.util.Scanner;

public class Asm3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b;
		double n;
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.print("Nhập vào số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập vào số b: ");
		b = scanner.nextDouble();
		System.out.println("Phương trình bậc nhất vừa nhập là: " + a + "x + " + b + " = 0");
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			n = (double) -b / a;
			System.out.println("Phương trình có nghiệm x = " + df.format(n));
		}
	}
}
