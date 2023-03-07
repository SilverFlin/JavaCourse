package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 4;
        int result = myIntValue + 4;
        System.out.println( "4 + 4 = " + result); // 8
        int myLastResult = result;
        System.out.println("myLastResult = " + myLastResult);
        result = result - 4;
        System.out.println( "8 - 4 = " + result); // 4
        result = result * 5;
        System.out.println(" 4 * 5 = " + result);
        result = result / 2;
        System.out.println("20 / 2 = " + result);
        result = result % 6;
        System.out.println("10 % 6 = " + result);

    }
}
