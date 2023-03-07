package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

         boolean result = canPack(0,5,6);
        System.out.println(result);

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if( bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int sum = 0;

        bigCount *= 5;

    while (sum != goal){

        if( bigCount != 0 && sum + 5 <= goal ){
            sum += 5;
            bigCount -=5;
            System.out.println(sum);
        } else if(smallCount != 0){
            sum ++;
            smallCount--;
            System.out.println(sum);
        }else{
            return false;
        }


    }
return true;
    }
}
