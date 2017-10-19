package lesson1.method_Scanner;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        double db = a / 10;
        int b = (int) db;
        System.out.println("your number is: " + b);
        sc.close ();
    }
}
