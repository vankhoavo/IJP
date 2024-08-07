package fa.training.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.training.entities.Student;

public class MyManagerStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Hiển thị các sinh viên được nhận học bổng");
            System.out.println("4. Exit");
            System.out.print("\nEnter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.inputInfo();
                    students.add(student);
                    break;
                case 2:
                    for (Student s1 : students) {
                        s1.showInfo();
                    }
                    break;
                case 3:
                    for (Student s2 : students) {
                        if (s2.scholarship()) {
                            System.out.println("Mã số sinh viên: " + s2.getMSSV());
                            System.out.println("Có học bổng vì điểm trung bình đạt được là " + s2.getDiemTB());
                        } else {
                            System.out.println("Không có học bổng vì điểm trung bình chỉ có " + s2.getDiemTB());
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
