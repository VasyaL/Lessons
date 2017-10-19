package lesson1.method_If;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        System.out.println("Enter your number x: ");

        if (sc.hasNextInt()) {

            x = sc.nextInt();
            System.out.println("Enter your number y:");
            if (sc.hasNextInt()){
                y = sc.nextInt();
                System.out.println("Your input numbers:" +x  + " and "  + +y);
                if (x != y) {
                    System.out.println("Your number x is: " + y);
                    System.out.println("Your number y is: " + x);
                } else
                    System.out.println("Your number equal x = y = " + x);
            }else
                System.out.println("Your input not number");

        } else
            System.out.println("Your input not number");
        sc.close();
    }
}
