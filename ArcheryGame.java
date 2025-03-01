   import java.util.Random;

public class ArcheryGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] scores = new int[4][3]; // 4 players, 3 chances
        int[] totals = new int[4];

        // Generate scores
        for (int player = 0; player < 4; player++) {
            for (int chance = 0; chance < 3; chance++) {
                scores[player][chance] = rand.nextInt(11); // Random score between 0 and 10
                totals[player] += scores[player][chance];
            }
        }

        // Display scores
        System.out.println("Player\tChance 1\tChance 2\tChance 3\tTotal");
        for (int player = 0; player < 4; player++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", player + 1, scores[player][0], scores[player][1], scores[player][2], totals[player]);
        }

        // Find winner
        int maxScore = totals[0];
        int winner = 0;
        for (int i = 1; i < 4; i++) {
            if (totals[i] > maxScore) {
                maxScore = totals[i];
                winner = i;
            }
        }
        System.out.println("Winner: Player " + (winner + 1));
    }
}