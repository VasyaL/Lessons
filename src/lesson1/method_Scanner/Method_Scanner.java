package lesson1.method_Scanner;

import java.util.Scanner; //імпорт сканера з бібіліотеки java.until;

public class Method_Scanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// оголошення сканера;
        System.out.println("enter number"); //вивід на екран enter number;
        int a = s.nextInt(); //метод зчитування з консолі числа типу int;
        System.out.println("result: " + a * 2); //вивід на екран числа, яке введео в (9), збільшене в 2 рази;
    }
}
