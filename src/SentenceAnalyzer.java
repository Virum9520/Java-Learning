import java.util.Scanner;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int alphabetCount = 0;
        int digitCount = 0;
        int specialSymbolCount = 0;
        int blankSpaceCount = 0;
        int wordCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                alphabetCount++;
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                blankSpaceCount++;
            } else {
                specialSymbolCount++;
            }
        }

        String[] words = sentence.split("\s");
        wordCount = words.length;

        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Symbols: " + specialSymbolCount);
        System.out.println("Blank Spaces: " + blankSpaceCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        scanner.close();
    }
}

