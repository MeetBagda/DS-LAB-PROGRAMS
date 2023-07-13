public class StringPattern {
    public static boolean isAibPattern(String input) {
        int countA = 0;
        int countB = 0;
        boolean foundB = false;

        for (char c : input.toCharArray()) {
            if (c == 'a') {
                countA++;
                if (foundB) {
                    return false;
                }
            } else if (c == 'b') {
                if (countA == 0) {
                    return false;
                }
                countB++;
                foundB = true;
            } else {
                return false;
            }
        }

        return countA > 0 && countA == countB;
    }

    public static void main(String[] args) {
        String[] testCases = { "ab", "aabb", "aaabbb", "aaabb", "abb", "abab", "abba" };

        for (String testCase : testCases) {
            System.out.println(testCase + ": " + isAibPattern(testCase));
        }
    }
}

