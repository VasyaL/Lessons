package lesson1.method_If;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Your number :" + a * 2);
        } else
            System.out.println("This is not number: ");
        sc.close();
    }
}
