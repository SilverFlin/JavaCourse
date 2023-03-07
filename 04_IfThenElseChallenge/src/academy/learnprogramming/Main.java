package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean game0ver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("Your score was = " + score);
        System.out.println("Level Completed = " + levelCompleted);
        System.out.println("Bonus = " + bonus);

        if(game0ver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // leveCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still display as well

        score = 10_000;
        levelCompleted =8;
        bonus = 200;

        System.out.println("Your score was = " + score);
        System.out.println("Level Completed = " + levelCompleted);
        System.out.println("Bonus = " + bonus);

        if(game0ver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
