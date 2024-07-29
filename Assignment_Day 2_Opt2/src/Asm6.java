public class Asm6 {
    public static void main(String[] args) {
        int i, j;
        i = j = 1;
        int a;
        a = i++ + j++ + i++ + j++;
        System.out.println("a = " + a);
    }
}
