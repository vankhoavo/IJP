import java.util.Arrays;
import java.util.Scanner;

public class Asm5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập N phần từ của mảng từ bàn phím: ");
		int N = sc.nextInt();

		// nhập giá trị vào mảng
		int[] arrA = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
			arrA[i] = sc.nextInt();
			if (arrA[i] % 2 == 0) {
				count++;
			}
		}
		int[] arrB = new int[count];
		int index = 0;
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] % 2 == 0) {
				arrB[index] = arrA[i];
				index++;
			}
		}
		System.out.println("Mảng A là: " + Arrays.toString(arrA));
		System.out.println("Mảng số chẳn B là: " + Arrays.toString(arrB));
	}
}