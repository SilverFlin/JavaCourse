package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Nombre;

        System.out.println("Ingresa tu nombre ");
        System.out.print("->");
        Nombre = sc.nextLine();
        System.out.println("");
//        int NombreLongitud = Nombre.length();
        System.out.println("La longitud de tu nombre es :" + Nombre.length());
        System.out.println("");
        System.out.println("Tu nombre letra por letra quedaria asi: ");

        for (int i = 0; i < Nombre.length(); i++) {
            System.out.println(i+1 + " -> " + Nombre.charAt(i));
        }


    }
}
