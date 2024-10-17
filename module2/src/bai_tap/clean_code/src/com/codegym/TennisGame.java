package bai_tap.clean_code.src.com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        if (scorePlayer1 == scorePlayer2) {
            return getEqualScore(scorePlayer1);
        } else if (isGameWon(scorePlayer1, scorePlayer2)) {
            return getWinnerScore(scorePlayer1, scorePlayer2, player1Name, player2Name);
        } else {
            return getRegularScore(scorePlayer1, scorePlayer2);
        }
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static boolean isGameWon(int scorePlayer1, int scorePlayer2) {
        return scorePlayer1 >= 4 || scorePlayer2 >= 4;
    }

    private static String getWinnerScore(int scorePlayer1, int scorePlayer2, String player1Name, String player2Name) {
        int scoreDifference = scorePlayer1 - scorePlayer2;

        if (scoreDifference == 1) {
            return "Advantage " + player1Name;
        } else if (scoreDifference == -1) {
            return "Advantage " + player2Name;
        } else if (scoreDifference >= 2) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    private static String getRegularScore(int scorePlayer1, int scorePlayer2) {
        StringBuilder score = new StringBuilder();
        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};

        for (int i = 1; i <= 2; i++) {
            int currentScore = (i == 1) ? scorePlayer1 : scorePlayer2;
            if (i == 2) score.append("-");
            score.append(scoreNames[currentScore]);
        }
        return score.toString();
    }
}
