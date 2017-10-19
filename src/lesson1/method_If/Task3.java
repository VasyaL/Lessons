package lesson1.method_If;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int b = a % 2;
        if (b == 0) {
            System.out.println("Четное");
        } else
            System.out.println("Нечетное");
        sc.close();

    }
}
