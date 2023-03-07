package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1){
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("Value was 2");
        } else{
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 5;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("3,4,5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break; // Not necessary at all
        }


        char myChar = 'Z';

        switch(myChar){

            case 'A':
                System.out.println("Found the letter A");
                break;
            case 'B':
                System.out.println("Found the letter B");
                break;
            case 'C':
                System.out.println("Found the letter C");
                break;
            case 'D':
                System.out.println("Found the letter D");
                break;
            case 'E':
                System.out.println("Found the letter E");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }


    }

}
