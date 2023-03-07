package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(10,10);
        System.out.println("----");
        calcFeetAndInchesToCentimeters(100);

        // 1 foot = 12 in
        // 1 in = 2.54cm

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches>=0 && inches<=12) ){
            double feetCentimeters =  ( (feet*12)*2.54  );
            double inchesCentimeters = (inches*2.54);;
            double totalCentimeters = feetCentimeters + inchesCentimeters;
            System.out.println("There are " + feetCentimeters + " feet to centimeters");
            System.out.println("There are " + inchesCentimeters + " inches to centimeters");
            System.out.println("And the total is " + totalCentimeters );
            return totalCentimeters;
        }else{
            System.out.println("Any invalid Input");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        double inchesToFeet = inches/12.0;
        double inchesLeft = inchesToFeet - (int)inchesToFeet;

        inchesToFeet -= inchesLeft;
        inchesLeft *= 12;

        return calcFeetAndInchesToCentimeters(inchesToFeet,inchesLeft);
        // 1 foot = 12 in
        // 1 in = 2.54cm

    }

}


