package lesson1.method_Scanner;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float number");
        double db = sc.nextDouble();
        int a = (int) db;

        double db1 = (db - a) * 10;
        int b = (int) db1;
        System.out.println("your number is :" + b);
        sc.close();

    }
}
