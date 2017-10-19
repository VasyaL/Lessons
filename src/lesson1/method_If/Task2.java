package lesson1.method_If;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter second number");
        int b = sc1.nextInt();
        if (a > b){
            System.out.println(a);
        }else
            System.out.println(b);


        //System.out.println("Max number is: " + Math.max(a, b));
        sc.close();
        sc1.close();
    }
}
