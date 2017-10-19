package lesson1.method_If;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Number is negative");
        } else if (a < 10) {
            System.out.println("This is numeral");
        } else
            System.out.println("Number is positive");
        sc.close();

    }

}

