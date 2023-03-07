package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    System.out.println(isPerfectNumber(6));


    }
    public static void printFactors(int num){
        if(num < 1){
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i < 1500 ; i++) {

            if(num % i == 0){
                System.out.println(i);
            }

        }

    }
    public static boolean isPerfectNumber(int num){

        if(num < 1){
            return false;
        }

        int sum = 0;

        for (int i = 1; i < num ; i++) {

                if(num % i == 0){
                    sum += i;
                }
                if((sum) == (num)){
                    return true;
                }


        }

        return false;

    }


}
