public class Asm7 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a;
        a = ++i + ++j + i++ + j++;
        System.out.println("a = " + a);
    }
}
