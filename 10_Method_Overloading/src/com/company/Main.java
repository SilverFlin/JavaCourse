package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Silver",500);
        System.out.println("New Score is " +newScore);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score *1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score *1000;
    }
    public static int calculateScore(){
        System.out.println("Unnamed player scored, no player score " );
        return 0;
    }
}
