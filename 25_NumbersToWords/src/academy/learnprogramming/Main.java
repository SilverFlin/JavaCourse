package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


//        System.out.println(reverse(900));

        numberToWords(900);
    }
    public static void numberToWords(int num){
        if(num<0){
            System.out.println("Invalid Value");
            return;
        }

        int digits = getDigitCount(num);
        int reversed = reverse(num);
        String word = "";

        for (int i = 0; i < digits; i++) {

          switch (reversed % 10){
              case 0:
                  word += "Zero ";
                break;
              case 1:
                  word += "One ";
                break;
              case 2:
                  word += "Two ";
                break;
              case 3:
                  word += "Three ";
                break;
              case 4:
                  word += "Four ";
                  break;
              case 5:
                  word += "Five ";
                  break;
              case 6:
                  word += "Six ";
                  break;
              case 7:
                  word += "Seven ";
                  break;
              case 8:
                  word += "Eight ";
                  break;
              case 9:
                  word += "Nine ";
                  break;
          }
          reversed/=10;

        }
        String newWord = word.substring(0, word.length()-1);
        System.out.println(newWord);


    }
    public static int reverse(int num){
        boolean flag = false;
        if (num < 0){
            num*= -1;
            flag = true;
        }

        int reversed = 0;

        while (num != 0){



            if(num < 9){
                reversed += num;

            }else{
                reversed += (num % 10);
                reversed *= 10;
            }
            num /= 10;
        }

        if(reversed % 10 == 0){
            reversed /= 10;
        }

        if(flag){
            return reversed * -1;
        }else{
            return reversed;
        }
    }
    public static int getDigitCount(int num){
        if(num<0) return -1;
        if (num == 0){
            return 1;
        }
        int count = 0;

        while(num!=0){
            num/=10;
            count++;
        }

        return count;
    }
}
