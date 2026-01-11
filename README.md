# Hangman
**By: Michael Volpe**

A simple Java console-based Hangman game where the player tries to guess a randomly selected word from a list. The game includes a replay feature, input validation, and tracks letters already guessed.

---

## Features

- Random word selection from a list of programming and computer-related terms
- 7 attempts per round
- Tracks letters already guessed
- Input validation (only letters, no repeated guesses)
- Replay functionality
- Console-based game, easy to run locally

---

## Example Output

```
Welcome to hangman!

You have 7 attempts remaining.
Word: _ _ _ _ _
Guessed:
Guess a letter: a

You have 7 attempts remaining.
Word: _ a _ _ _
Guessed: a
Guess a letter: e

You have 6 attempts remaining.
Word: _ a _ _ _
Guessed: a e
Guess a letter: j
Congrats! The word was: java
Do you want to play again? (y/n): n
Thanks for playing!
```

---

## How to run
1. Clone the repo:
   git clone https://github.com/yourusername/HangmanGame.git
2. Go to the folder:
   cd HangmanGame
3. Compile the Java file:
   javac Main.java
4. Run the game:
   java Main
   
