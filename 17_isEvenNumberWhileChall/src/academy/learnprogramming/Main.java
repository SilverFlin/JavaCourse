package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int total = 0;
        int evenNumberFound = 0;

        while (number <= finishNumber){
            number++;
            if (evenNumberFound == 5){
                break;
            }
            if (!isEvenNumber(number)){
                continue;
            }
            total+= number;
            evenNumberFound++;

            System.out.println("Even Number " + number);
        }
        System.out.println("Total is= " + total);

    }
    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }
}
