package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 valid numbers");
        System.out.println();
        int tenNumbersCount = 1;
        int sum = 0;

        while (tenNumbersCount <= 10){

            System.out.println("Enter the number #" + tenNumbersCount);
            boolean validNumber = scanner.hasNextInt();
            if (validNumber){
                sum += scanner.nextInt();
                tenNumbersCount++;
            }else{
                System.out.println("~~~~~~~~~~~~~~");
                System.out.println("Invalid Number");
                System.out.println("~~~~~~~~~~~~~~");
                scanner.nextLine(); // handle end of line (enter key)
            }
        }
        System.out.println("The total is: " + sum);
        scanner.close();


    }
}

//Read 10 numbers from the console enetered by the user and print the sum of those numbers
