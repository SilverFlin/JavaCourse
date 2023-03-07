package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main 1");
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();
        System.out.println("Main 2");


    }
}
