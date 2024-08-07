package fa.training.entities;

import java.util.Scanner;

public class Sale {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int sumTimeWork;
    private static int saleCount = 0;

    public Sale() {
        saleCount++;
    }

    public Sale(String name, int age, String address, double salary, int sumTimeWork) {
        this();
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.sumTimeWork = sumTimeWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSumTimeWork() {
        return sumTimeWork;
    }

    public void setSumTimeWork(int sumTimeWork) {
        this.sumTimeWork = sumTimeWork;
    }

    public static int getSaleCount() {
        return saleCount;
    }

    public static void setSaleCount(int saleCount) {
        Sale.saleCount = saleCount;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ của bạn: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập tiền lương của bạn: ");
        this.salary = scanner.nextInt();
        System.out.print("Nhập tổng thời gian làm việc: ");
        this.sumTimeWork = scanner.nextInt();
        scanner.nextLine();
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Total sum working time: " + sumTimeWork);
    }

    public double getBonus() {
        if (sumTimeWork >= 200) {
            return salary * 0.2;
        } else if (sumTimeWork < 200 && sumTimeWork >= 100) {
            return salary * 0.1;
        } else {
            return 0;
        }
    }
}