import java.text.DecimalFormat;
import java.util.Scanner;

public class Asm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        double price;
        int quantity;
        double discountPer_100_120 = 10.0;
        double discountPer_120 = 15.0;
        double discountPer_100 = 0.0;
        double revenue_from_sales;
        double revenue_discounted;
        System.out.print("Nhập đơn giá của sản phẩm: ");
        price = sc.nextDouble();
        System.out.print("Nhập số lượng của sản phẩm: ");
        quantity = sc.nextInt();
        if (quantity >= 100 && quantity <= 120) {
            revenue_discounted = (price * discountPer_100_120) / 100;
            System.out.println("Sau khi chiết khấu: " + revenue_discounted + " $");
            revenue_from_sales = (price * quantity) - revenue_discounted;
            System.out.println("Doanh thu từ việc bán hàng: " + df.format(revenue_from_sales) + "$" + " "
                    + " " + (discountPer_100_120) + "$");
        } else if (quantity > 120) {
            revenue_discounted = (price * discountPer_120) / 100;
            System.out.println("Sau khi chiết khấu: " + revenue_discounted + " $");
            revenue_from_sales = (price * quantity) - revenue_discounted;
            System.out.println("Doanh thu từ việc bán hàng: " + df.format(revenue_from_sales) + "$" + " "
                    + (discountPer_120) + "$");
        } else {
            revenue_discounted = (price * discountPer_100) / 100;
            System.out.println("Sau khi chiết khấu: " + revenue_discounted + " $");
            revenue_from_sales = (price * quantity) - revenue_discounted;
            System.out.println("Doanh thu từ việc bán hàng: " + df.format(revenue_from_sales) + "$" + " "
                    + ("(discountPer_100)") + "$");
        }
    }
}
