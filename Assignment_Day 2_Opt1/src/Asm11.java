public class Asm11 {
    public static void main(String[] args) {
        double a = 127.0;
        float b = (float) a;
        long c = (long) b;
        int d = (int) c;
        short e = (short) d;
        byte f = (byte) e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
