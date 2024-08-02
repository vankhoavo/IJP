/*
 * Trong Java, ép kiểu (type casting) là quá trình chuyển đổi một biến từ kiểu
 * dữ liệu này sang kiểu dữ liệu khác. Có hai loại ép kiểu: ép kiểu tường minh
 * và ép kiểu ngầm định.
 * 
 * 1. **Ép kiểu tường minh (Explicit Casting)**:
 * - Người lập trình phải chỉ rõ kiểu dữ liệu mà biến sẽ được chuyển đổi sang.
 * - Sử dụng dấu ngoặc đơn để chỉ rõ kiểu dữ liệu cần ép.
 * - Thường được sử dụng khi chuyển từ kiểu dữ liệu lớn hơn sang kiểu dữ liệu
 * nhỏ hơn (ví dụ: từ `double` sang `int`).
 * - Ví dụ:
 * ```java
 * double d = 9.8;
 * int i = (int) d; // i sẽ là 9
 * ```
 * 
 * 2. **Ép kiểu ngầm định (Implicit Casting)**:
 * - Java tự động chuyển đổi kiểu dữ liệu mà không cần sự can thiệp của người
 * lập trình.
 * - Xảy ra khi chuyển từ kiểu dữ liệu nhỏ hơn sang kiểu dữ liệu lớn hơn (ví dụ:
 * từ `int` sang `double`).
 * - Ví dụ:
 * ```java
 * int i = 10;
 * double d = i; // d sẽ là 10.0
 * ```
 */