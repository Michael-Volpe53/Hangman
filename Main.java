import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean game = true;
        String guessedLetters = "";
        String[] words = {
    "java", "computer", "program", "keyboard", "mouse",
    "internet", "monitor", "laptop", "algorithm", "function",
    "variable", "compiler", "developer", "software", "hardware",
    "database", "network", "thread", "object", "class",
    "method", "array", "boolean", "string", "exception",
    "package", "interface", "module", "syntax", "loop",
    "condition", "constructor", "framework", "library", "debug",
    "stack", "queue", "pointer", "recursion", "encryption"
};
        System.out.println("Welcome to hangman!");
        while (game) {
            int randomWord = (int)(Math.random() * words.length);
            String word = words[randomWord];
            
            char[] blanks = new char[word.length()];
            for (int i = 0; i < blanks.length; i++) {
                blanks[i] = '_';
            }
            int attempts = 7;
            boolean guessedRight = false;

            while (attempts > 0 && !guessedRight) {
                System.out.println();
                System.out.println("You have " + attempts + " attempts remaining.");
                System.out.print("Word: ");
                for (char c: blanks){
                    System.out.print(c + " ");
                }
                System.out.println();
                System.out.println("Guessed: " + guessedLetters);
                System.out.print("Guess a letter: ");
                char guess = input.next().charAt(0);
                guessedLetters += guess;
                
                if (guessedLetters.indexOf(guess) != guessedLetters.length() - 1) {
                    System.out.println("You already guessed that letter!");
                    continue;
                }
                if (!Character.isLetter(guess)) {
                    System.out.println("Please enter a valid letter!");
                    continue;
                }


                if (word.indexOf(guess) >= 0) {
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == guess) {
                            blanks[i] = guess;
                        }
                    }
                }
                else {
                    attempts--;
                    continue;
                }
                if (String.valueOf(blanks).equals(word)) {
                    guessedRight = true;
                    System.out.println("Congrats! The word was: " + word);
                }
                else if (attempts == 0) {
                    System.out.println("Out of attempts! The word was: " + word);
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = input.next().toLowerCase();
            if (playAgain.equals("y")) {
                guessedLetters = "";
                continue;
            }
            if (!playAgain.equals("y")) {
                game = false;
                System.out.println("Thanks for playing!");
            }
        }
        input.close();
    }
}