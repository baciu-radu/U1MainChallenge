public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        System.out.println("Your final score was " + calculateScore(gameOver, score, 5, 100));
        calculateScore(true, 800, 5, 100);


/*        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = score;
        if (newGameOver) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + newFinalScore);
        }*/
        calculateScore(true, 10000, 8, 200);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;
        finalScore += 1000;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }
        return finalScore;
    }
}