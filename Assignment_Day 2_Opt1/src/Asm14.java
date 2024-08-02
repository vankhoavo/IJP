/*
 * Trong Java, các ký tự hậu tố như `L`, `F`, `D` sau các số nguyên và số thực
 * được dùng để chỉ định rõ ràng kiểu dữ liệu của các số đó. Dưới đây là các
 * tình huống cụ thể khi cần và không cần sử dụng các ký tự này:
 * 
 * ### Khi nào cần dùng các ký tự hậu tố:
 * 
 * 1. **L (Long)**:
 * - Dùng `L` để chỉ định rằng một số nguyên là kiểu `long`. Ví dụ:
 * ```java
 * long num = 123456789L;
 * ```
 * - Nếu không dùng `L`, Java sẽ mặc định hiểu số nguyên đó là kiểu `int`.
 * 
 * 2. **F (Float)**:
 * - Dùng `F` để chỉ định rằng một số thực là kiểu `float`. Ví dụ:
 * ```java
 * float num = 3.14F;
 * ```
 * - Nếu không dùng `F`, Java sẽ mặc định hiểu số thực đó là kiểu `double`.
 * 
 * 3. **D (Double)**:
 * - Thực ra, `D` không nhất thiết phải dùng vì Java mặc định sẽ hiểu số thực là
 * kiểu `double`. Tuy nhiên, bạn có thể dùng `D` để rõ ràng hơn. Ví dụ:
 * ```java
 * double num = 3.14D;
 * ```
 * 
 * ### Khi nào không cần dùng các ký tự hậu tố:
 * 
 * 1. **Số nguyên kiểu `int`**:
 * - Java mặc định hiểu một số nguyên không có hậu tố là kiểu `int`. Ví dụ:
 * ```java
 * int num = 12345;
 * ```
 * 
 * 2. **Số thực kiểu `double`**:
 * - Java mặc định hiểu một số thực không có hậu tố là kiểu `double`. Ví dụ:
 * ```java
 * double num = 3.14;
 * ```
 * 
 * ### Tóm lại:
 * - Dùng `L` khi muốn số nguyên là kiểu `long`.
 * - Dùng `F` khi muốn số thực là kiểu `float`.
 * - Có thể dùng `D` khi muốn rõ ràng chỉ định số thực là kiểu `double`, nhưng
 * không bắt buộc vì Java mặc định hiểu số thực là kiểu `double`.
 */