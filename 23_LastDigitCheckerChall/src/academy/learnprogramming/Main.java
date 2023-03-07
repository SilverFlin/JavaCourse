package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(222,333,443));

    }
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x) || isValid(y) || isValid(z)){
            return false;
        }

        return (x%10 == y%10) || (x%10 == z%10) ||  (y%10 == z%10);
    }
    public static boolean isValid(int num){

        return!( num >= 10 && num <=1000);

    }
}
