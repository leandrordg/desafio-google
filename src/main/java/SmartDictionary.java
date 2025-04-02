import java.util.List;

public class SmartDictionary {

    public static int levenshteinDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (word1.charAt(i - 1) == word2.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(
                            Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1),
                            dp[i - 1][j - 1] + cost
                    );
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }

    public static String fixWord(List<String> dictionary, String typedWord) {
        if (dictionary.contains(typedWord)) {
            return typedWord;
        }

        String correctWord = null;
        int lowerDistance = 3; // requested by google

        for (String word : dictionary) {
            int distance = levenshteinDistance(typedWord, word);
            if (distance < lowerDistance) {
                lowerDistance = distance;
                correctWord = word;
            }
        }

        return correctWord;
    }

    public static void main(String[] args) {
        List<String> dictionary = List.of("casa", "cama", "carro", "gato", "pato");

        String[] words = {"casa", "caso", "gatu", "pata", "carroça"};

        for (String word : words) {
            System.out.println("Input: " + word + ", Output: " + fixWord(dictionary, word));
        }
    }
}
