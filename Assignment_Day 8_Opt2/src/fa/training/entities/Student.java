package fa.training.entities;

import java.util.Scanner;

public class Student {
    private String mssv;
    private double diemTB;
    private int age;
    private String classStudent;

    public Student() {
    }

    public Student(String mssv, double diemTB, int age, String classStudent) {
        super();
        this.mssv = mssv;
        this.diemTB = diemTB;
        this.age = age;
        this.classStudent = classStudent;
    }

    public String getMSSV() {
        return mssv;
    }

    public void setMSSV(String mssv) {
        this.mssv = mssv;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập MSSV: ");
            this.mssv = scanner.nextLine();
            if (this.mssv == null || this.mssv.length() != 8) {
                System.out.println("Tên phải có độ dài bằng 8 ký tự và không được để trống. Vui lòng nhập lại.");
            }
        } while (this.mssv == null || this.mssv.length() != 8);

        do {
            System.out.print("Nhập điểm trung bình: ");
            this.diemTB = scanner.nextDouble();
            if (this.diemTB < 0 || this.diemTB > 10) {
                System.out.println("Vui lòng nhập điểm lại trong khoảng từ 0 đến 10. Vui lòng nhập lại.");
            }
        } while (this.diemTB < 0 || this.diemTB > 10);

        do {
            System.out.print("Nhập tuổi: ");
            this.age = scanner.nextInt();
            if (this.age < 18) {
                System.out.println(
                        "Vui lòng nhập tuổi từ khoảng độ tuổi từ lớn hơn hoặc bằng 18 tuổi. Vui lòng nhập lại.");
            }
            scanner.nextLine();
        } while (this.age < 18);

        do {
            System.out.print("Nhập lớp: ");
            this.classStudent = scanner.nextLine();
            if (!this.classStudent.startsWith("A") && !this.classStudent.startsWith("C")) {
                System.out.println("Vui lòng nhập lại lớp có ký tự bắt đầu chữ A và C. Vui lòng nhập lại.");
            }
        } while (!this.classStudent.startsWith("A") && !this.classStudent.startsWith("C"));
    }

    public void showInfo() {
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Điểm trung bình: " + diemTB);
        System.out.println("Tuổi: " + age);
        System.out.println("Lớp: " + classStudent);
    }

    public boolean scholarship() {
        return diemTB > 8.0;
    }
}
