package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        System.out.println(getLargestPrime(45));


    }
    public static int getLargestPrime(int number){
        for (int i = 2; i < number ; i++) {
            if(number % i == 0 ){
                System.out.println(i);
                number /= i;
                i--;
            }
        }
    return number;
    }
}


//getLargestPrime method
//Largest prime factor of given number