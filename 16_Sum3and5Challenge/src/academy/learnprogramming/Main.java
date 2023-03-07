package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int sumNumTotal = 0;
        int count = 0;

        for (int i = 1; i <= 1000 ; i++) {
            if (count == 5){
                break;
            } else if( i % 3 == 0 && i % 5 == 0){
                sumNumTotal += i;
                count++;
                System.out.println(i);
            }
        }


        System.out.println("The total is = " + sumNumTotal);

    }
}
