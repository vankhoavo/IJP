public class Asm8 {
    public static void main(String[] args) {
        int i = 1;
        int a;
        a = i++ + ++i - i-- - --i;
        System.out.println("a = " + a);
    }
}
