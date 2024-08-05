import java.util.Scanner;

public class Asm5 {
    public static void nhapThongTinSV(int[] sv, int n, String[] tensv, float[] diemSQLBasic, float[] diemJavaBasic,
            float[] diemJavaAdvance) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhập thông tin học viên thứ " + (i + 1));
            System.out.print("\nNhập tên: ");
            tensv[i] = scanner.nextLine();
            System.out.print("Nhập điểm SQL Basic: ");
            diemSQLBasic[i] = scanner.nextFloat();
            System.out.print("Nhập điểm Java Basic: ");
            diemJavaBasic[i] = scanner.nextFloat();
            System.out.print("Nhập điểm Java Advance: ");
            diemJavaAdvance[i] = scanner.nextFloat();
            scanner.nextLine();
        }
        System.out.println();
    }

    public static void hienthiThongTinSV(int[] sv, int n, String[] tensv, float[] diemSQLBasic, float[] diemJavaBasic,
            float[] diemJavaAdvance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thông tin học viên như sau: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i + 1));
            System.out.println("Họ tên sinh viên: " + tensv[i]);
            System.out.println("Điểm SQL Basic: " + diemSQLBasic[i]);
            System.out.println("Điểm Java Basic: " + diemJavaBasic[i]);
            System.out.println("Điểm Java Advance: " + diemJavaAdvance[i]);
            System.out.println();
        }
    }

    public static void tinhhienthiDTB(int[] sv, int n, String[] tensv, float[] diemSQLBasic, float[] diemJavaBasic,
            float[] diemJavaAdvance) {
        System.out.println("Điểm trung bình của sinh viên: \n");
        for (int i = 0; i < n; i++) {
            float diemTB = (diemSQLBasic[i] + diemJavaBasic[i] + diemJavaAdvance[i]) / 3;
            System.out.println("Điểm trung bình sinh viên thứ " + (i + 1));
            System.out.println("Họ tên sinh viên: " + tensv[i]);
            System.out.println("Điểm trung bình sinh viên: " + diemTB);
            System.out.println();
        }
    }

    public static void diemlonhon6phay5(int[] sv, int n, String[] tensv, float[] diemSQLBasic, float[] diemJavaBasic,
            float[] diemJavaAdvance) {
        System.out.println("Học viên có điểm trung bình lớn hơn 6.5: ");
        for (int i = 0; i < n; i++) {
            float diemTB = (diemSQLBasic[i] + diemJavaBasic[i] + diemJavaAdvance[i]) / 3;
            if (diemTB >= 6.5) {
                System.out.println(tensv[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] sv = new int[n];
        String[] tensv = new String[n];
        float[] diemSQLBasic = new float[n];
        float[] diemJavaBasic = new float[n];
        float[] diemJavaAdvance = new float[n];
        nhapThongTinSV(sv, n, tensv, diemSQLBasic, diemJavaBasic, diemJavaAdvance);
        hienthiThongTinSV(sv, n, tensv, diemSQLBasic, diemJavaBasic, diemJavaAdvance);
        hienthiThongTinSV(sv, n, tensv, diemSQLBasic, diemJavaBasic, diemJavaAdvance);
        tinhhienthiDTB(sv, n, tensv, diemSQLBasic, diemJavaBasic, diemJavaAdvance);
    }
}
