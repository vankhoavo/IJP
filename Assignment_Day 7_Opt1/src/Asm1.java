import java.util.ArrayList;
import java.util.List;

public class Asm1 {
    public static void main(String[] args) {
        List<String> danhSach = new ArrayList<>();
        danhSach.add("Võ Văn Khoa");
        danhSach.add("Ngô Xuân Thịnh");
        danhSach.add("Ngô Minh Nhật");

        for (String chuoi : danhSach) {
            System.out.println(chuoi);
        }
    }
}