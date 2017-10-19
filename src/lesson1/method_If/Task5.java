package lesson1.method_If;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the second number");
        int b = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the third number");
        int c = sc3.nextInt();

        if ((a | b) < c) {
            System.out.println("Number c is max: " + c);
        }
        if ((a | c) < b) {
            System.out.println("Number b is max: " + b);
        }
        if ((b | c) < a) {
            System.out.println("Number a is max: " + a);
        }else
            System.out.println("numbers are equal: " + (a = b = c));
        sc1.close();
        sc2.close();
        sc3.close();


    }
}
