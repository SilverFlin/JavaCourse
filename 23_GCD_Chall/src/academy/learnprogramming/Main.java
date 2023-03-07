package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(15,25));

    }
    public static int getGreatestCommonDivisor(int first, int second){

        if(first < 10 || second < 10){
            return -1;
        }
        int GCD = 0;

        for (int i = 2; i < 1500 ; i++) {
            if(first%i == 0 && second%i == 0){
                GCD= i;
            }
        }
        return GCD;

    }
}
