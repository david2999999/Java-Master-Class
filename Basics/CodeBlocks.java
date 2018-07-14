package Basics;

public class CodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000){
            System.out.println("Your score is less than 5000");
        } else if (score < 1000){
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // challenge
        boolean newGameOver = true;
        int newScore = 800;
        int newLevelCompleted = 5;
        int newBonus = 100;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score: " + finalScore);
        }
    }
}
