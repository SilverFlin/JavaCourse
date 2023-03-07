package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(4));


    }
    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }

//        int hundredsTotal = 0;
//        int hundredsUnit = 0;
//        int tensTotal = 0;
//        int tensUnit = 0;
//
//        for (int i = 0; i < number/100; i++) {
//            hundredsTotal += 100;
//            hundredsUnit ++;
//        }
//
//        for (int i = 0; i < (number-hundredsTotal) / 10; i++) {
//            tensTotal += 10;
//            tensUnit ++;
//        }
//        int unitsUnit = number - hundredsTotal - tensTotal;
//
//        return hundredsUnit+tensUnit+unitsUnit;

        //WHILE

        int sum = 0;

        while(number != 0){
            sum += number % 10;
            number/=10;
        }

        return sum;
    }
}
