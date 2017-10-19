package lesson2;

public class Method_While {
    public static void main(String[] args) {




        int mas2[] = new int[10];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 9);
            //System.out.print(mas2[i] + " ");
        }

        int w = 10;
        while (w >= 0) {
           // System.out.println(w+ ",");
            w--;

        }
    }
}

