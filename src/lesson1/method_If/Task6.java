package lesson1.method_If;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Скільки вам років?");
        int a = sc.nextInt();

        if (a <= 6) {
            System.out.println("Вам би погратись");
        }
        if (a > 6 && a <=16){
            System.out.println("Вам би в школу");
        }
        if (a <= 24 && a >16){
            System.out.println("Вам би в університет");
        }
        if (a > 24 && a <= 60){
            System.out.println("Вам би на роботу");
        }
        if (a > 60){
            System.out.println("Ви пенсіонер");
        }
        sc.close();

    }
}
