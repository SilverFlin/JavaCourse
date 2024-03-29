package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quantity of numbers");
        int qty = sc.nextInt();
        int [] myArray = readInteger(qty);
        System.out.println(findMin(myArray));
    }
    public static int[] readInteger(int count){
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("index-"+i+":  ");
            numbers[i] = sc.nextInt();
        }
    return numbers;
    }
    public static int findMin(int[] array){
        int currentNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<currentNum){
                currentNum = array[i];
            }
        }
        return currentNum;
    }
}
/* -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef


 */