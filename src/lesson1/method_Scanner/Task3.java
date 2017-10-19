package lesson1.method_Scanner;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// оголошення сканера;
        System.out.println("enter number"); //вивід на екран enter number;
        int a = s.nextInt(); //метод зчитування з консолі числа типу int;
        int b = s.nextInt(); //метод зчитування з консолі числа типу int;
        int res = a + b;
        System.out.println("result: " + res); //вивід на  екран суми;
    }
}
