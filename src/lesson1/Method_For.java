package lesson1;

public class Method_For {

    public static void main(String[] args) {
        int a = 5;
        int rez;
        rez = 1;
        for (int i = 1; i < a; i++) { //задаємо счетчик від і=1 до і=5, яке збільшується на одницю
            rez = rez * i; //задаємо що результат буде залежати від і.
            System.out.println(rez); //вивід наекран всіх значень факторіалу у діапазоні а.
        }
        System.out.println(rez); //вивід на екран кінцевого результату.
    }
}
