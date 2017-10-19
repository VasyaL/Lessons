package lesson1.method_Scanner;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// оголошення сканера;
        System.out.println("enter number"); //вивід на екран enter number;
        double a = s.nextDouble(); //метод зчитування з консолі числа типу double;
        int b = (int) a;
        System.out.println("result: " + b); //вивід на  екран;
    }
}
