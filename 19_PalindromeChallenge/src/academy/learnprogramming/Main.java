package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;

        if (number < 0) number*= -1;


        while(number != 0){
            System.out.println("current reverse is " + reverse);
            System.out.println("current num value is "+ number);
            System.out.println("---");
            reverse += number % 10;
            reverse *= 10;
            number /= 10;
        }
        reverse /= 10;
        System.out.println(number);
        System.out.println(reverse);

        return reverse == originalNumber;

    }
}
