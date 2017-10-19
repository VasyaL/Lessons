package lesson1.method_Scanner;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// оголошення сканера;
        System.out.println("enter number"); //вивід на екран enter number;
        System.out.println("enter number"); //вивід на екран enter number;
        System.out.println("enter number"); //вивід на екран enter number;
        int a = s.nextInt(); //метод зчитування з консолі числа типу int;
        int b = s.nextInt(); //метод зчитування з консолі числа типу int;
        System.out.println("result: " + b); //вивід на  екран цілого числа, яке введео в (9);
        System.out.println("result: " + a); //вивід на  екран цілого числа, яке введео в (9);
    }
}
