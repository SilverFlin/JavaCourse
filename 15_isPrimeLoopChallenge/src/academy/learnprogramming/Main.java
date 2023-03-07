package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 800; i < 10000 ; i++) {
            if (isPrime(i)){
            System.out.println(i + " Is a prime Number");
            count ++;
                if (count == 10){
                    break;
                }
            }


        }

    }
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for (int i= 2; i< n/2 ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
