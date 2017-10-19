package lesson1.method_If;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Your input number is: " + a);

            if (a >= 10 && a <= 99) {
                int b = a / 10;
                System.out.println("First numeral of number is: " + b);
            } else
                System.out.println("Please, enter two-digit number");

        } else
            System.out.println("This is not number");


    }
}
