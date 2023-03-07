package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Min and Max values");
        System.out.println();

        int currentMaxValue = 0,currentMinValue = 0, newNum ;
        boolean isValidNumber;
        while(true){

            System.out.println("Enter the value");
            isValidNumber = scanner.hasNextInt();
            if (isValidNumber){

                newNum = scanner.nextInt();
                if (currentMinValue == 0) currentMinValue = newNum;


                if (newNum > currentMaxValue){
                    currentMaxValue = newNum;
                }else{
                    currentMinValue = newNum;
                }

                scanner.nextLine();
            }else{
                break;
            }

        }

        System.out.println("Current max value is: " + currentMaxValue);
        System.out.println("Current min value is: " + currentMinValue);

        scanner.close();

    }
}

//invalid number > break the loop
// print min and max

