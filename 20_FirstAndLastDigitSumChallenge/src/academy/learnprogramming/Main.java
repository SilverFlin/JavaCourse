package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(676));

    }

    public static int sumFirstAndLastDigit(int number){

        if(number < 0) return -1;

        int sum = number%10;

        while(number != 0){

            if (number<10) sum += number;

            number /= 10;
        }

        return sum;
    }


}
