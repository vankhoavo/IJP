public class Asm8 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a = ++i + j++;
        System.out.println("a = " + a);
    }
}
