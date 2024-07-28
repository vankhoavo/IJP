public class Asm4 {
    public static void main(String[] args) {
        boolean a = true && false;
        boolean b = (3 > 100) || (25 % 5 == 0);
        boolean c = a && b;
        boolean d = !a || b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}

/*
 * 1. **Biến a:**
 * 
 * ```java
 * boolean a = true && false;
 * ```
 * 
 * - Toán tử `&&` (AND logic) yêu cầu cả hai toán hạng phải `true` thì kết quả
 * mới là `true`.
 * - Ở đây, một toán hạng là `true` và một toán hạng là `false`.
 * - `true && false` sẽ là `false`.
 * 
 * Vì vậy, `a` có giá trị là `false`.
 * 
 * 2. **Biến b:**
 * 
 * ```java
 * boolean b = (3 > 100) || (25 % 5 == 0);
 * ```
 * 
 * Chúng ta sẽ chia biểu thức này thành hai phần:
 * 
 * - `(3 > 100)`: Đây là một phép so sánh:
 * - `3` không lớn hơn `100`.
 * - Vì vậy, `(3 > 100)` là `false`.
 * 
 * - `(25 % 5 == 0)`: Đây là một phép kiểm tra chia hết:
 * - `25 % 5` là phép toán tìm phần dư khi chia `25` cho `5`.
 * - Kết quả là `0`, nghĩa là `25` chia hết cho `5`.
 * - Vì vậy, `(25 % 5 == 0)` là `true`.
 * 
 * - Toán tử `||` (OR logic) yêu cầu ít nhất một trong hai toán hạng phải `true`
 * thì kết quả mới là `true`.
 * - Ở đây, một toán hạng là `false` và một toán hạng là `true`.
 * - `false || true` sẽ là `true`.
 * 
 * Vì vậy, `b` có giá trị là `true`.
 * 
 * 3. **Biến c:**
 * 
 * ```java
 * boolean c = a && b;
 * ```
 * 
 * - `a` đã được tính là `false`.
 * - `b` đã được tính là `true`.
 * - Toán tử `&&` (AND logic) yêu cầu cả hai toán hạng phải `true` thì kết quả
 * mới là `true`.
 * - Ở đây, một toán hạng là `false` và một toán hạng là `true`.
 * - `false && true` sẽ là `false`.
 * 
 * Vì vậy, `c` có giá trị là `false`.
 * 
 * 4. **Biến d:**
 * 
 * ```java
 * boolean d = !a || b;
 * ```
 * 
 * - `a` đã được tính là `false`.
 * - Toán tử `!` (NOT logic) đảo ngược giá trị logic của toán hạng.
 * - `!a` là `!false`, tức là `true`.
 * - `b` đã được tính là `true`.
 * - Toán tử `||` (OR logic) yêu cầu ít nhất một trong hai toán hạng phải `true`
 * thì kết quả mới là `true`.
 * - Ở đây, cả hai toán hạng đều là `true`.
 * - `true || true` sẽ là `true`.
 * 
 * Vì vậy, `d` có giá trị là `true`.
 */