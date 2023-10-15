package Java;

/* Check if the input is pangram or not. (A pangram is a sentence that contains all the 
alphabets from A to Z) */

public class Pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }

    public static boolean isPangram(String input) {
        boolean[] alphabetPresent = new boolean[26];
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }
        return true;
    }
}
