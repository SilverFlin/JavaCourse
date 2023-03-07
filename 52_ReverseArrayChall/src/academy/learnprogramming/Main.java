package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5};

        reverse(myArray);


    }

    private static void reverse (int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int temporal;
        int limit = array.length;
        for (int j = 0; j <= array.length; j++) {
            for (int i = 1; i < limit; i++) {
                temporal = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temporal;
            }
            limit--;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
/*-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name eReverseArrayChallengef

 */