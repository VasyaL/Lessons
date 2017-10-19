package lesson1.method_If;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b;
        System.out.println("Input your numeral: ");
        if (sc.hasNextInt()){
            b = sc.nextByte();
            System.out.println("Your input numeral or number");
            if (b < 10){
                System.out.println("Your input numeral: " +b);
                System.out.println((char) b);
                if (b == 0){
                    System.out.println("zero");
                }
                if (b== 1){
                    System.out.println("one");
                }
                if (b==2){
                    System.out.println("two");
                }
                if (b==3){
                    System.out.println("three");
                }
                if (b==4){
                    System.out.println("four");
                }
                if (b==5){
                    System.out.println("five");
                }
                if (b==6){
                    System.out.println("six");
                }
                if (b==7){
                    System.out.println("seven");
                }
                if (b==8){
                    System.out.println("eight");
                }
                if (b==9){
                    System.out.println("nine");
                }
            }else
                System.out.println("Your input not numeral");
        }else
            System.out.println("Your input not numeral or number");

    }
}
