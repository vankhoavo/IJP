public class Asm2 {
    public static void main(String[] args) {
        int soDong = 7;
        for (int i = 1; i <= soDong; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = soDong; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
