package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(50, 20));

    }
    public static boolean hasSharedDigit (int x , int y){
        if(x < 10 || x > 99 || y < 10 || y > 99 ){
            return false;
        }
        int secondX = 0, firstX = 0,secondY = 0, firstY = 0;


        if(x%10 == 0){
            secondX +=0;
        } else{
            secondX += x%10;
        }
        x/=10;
        firstX += x%10;
        //////////////////////
        if(y%10 == 0){
            secondY +=0;
        } else{
            secondY += y%10;
        }
        y/=10;
        firstY += y%10;

        return (firstX == firstY) || (firstX == secondY) || (secondX == firstY) || (secondX == secondY);
    }
}
