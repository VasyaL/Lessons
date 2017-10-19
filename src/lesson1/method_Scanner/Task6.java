package lesson1.method_Scanner;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// оголошення сканера;
        System.out.println("enter UAH"); //вивід на екран грн;
        double a = s.nextDouble(); //метод зчитування з консолі числа типу double;
        int b = (int) a; //перетворення double на int;
        System.out.println("result grn: " + b); //вивід на екран цілої частини грн;
        double c = (a - b)* 100;
        int d = (int) c; //перетворення double на int;
        System.out.println("result kop: " + d); //вивід на екран цілої частини копійок;

        s.close();
    }
}
