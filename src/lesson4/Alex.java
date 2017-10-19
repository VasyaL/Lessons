package lesson4;

public class Alex extends Person {

    @Override
    public void getjob() {
        super.getjob();
    }

    public static void main(String[] args) {

        Alex alex = new Alex();
        alex.gethobbie();
        alex.getjob();
    }
}
