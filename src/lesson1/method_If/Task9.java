package lesson1.method_If;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a > 999 && a <= 9999) {

                System.out.println("Your input number is: " + a);
                int b = a % 10;
                if (b == 0) {
                    System.out.println("Четверте число нуль");
                }
                int c = a / 10 % 10;
                if (c == 0) {
                    System.out.println("Третє число нуль");
                }
                int d = a / 100 % 10;
                if (d == 0) {
                    System.out.println("Друге число нуль");
                }
                if (b!=0 & c!=0 & d!=0) {
                    System.out.println("Число не має нулів");
                }
            } else
                System.out.println("Please, enter four-digit number");
        } else
            System.out.println("This is not number");
        sc.close();
    }
}
