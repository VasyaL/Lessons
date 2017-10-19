package lesson1.method_Scanner;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price:");
        double p = sc.nextDouble(); // вводимо ціну товару;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter amount of money");
        double m = sc1.nextDouble(); // вводимо суму грошей
        double n = m / p; // кількість товару;
        System.out.println("Units of goods");
        int a = (int) n; //кількість товару цілим числом;
        System.out.println(a);
        System.out.println("Odd money: " + (m - (a * p))); //здача, грн;
        sc.close();
        sc1.close();


    }
}
