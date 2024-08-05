package comps.Aurionpro.Homework;
import java.util.*;

public class WordGuesserGame {
  public static void main(String[] args) {
	
	  System.out.println("Guess the following word:");
      String[] words = {"java", "programming", "openai", "hangman", "computer"};
      Random random = new Random();
      String word = words[random.nextInt(words.length)]; 

      char[] blanks = new char[word.length()]; 
      for (int i = 0; i < blanks.length; i++) {
          blanks[i] = '_';
          System.out.print("_"+ " ");
      }
      
      System.out.println();

      int lives = word.length()*2; 
      Scanner scanner = new Scanner(System.in);

      while (true) {
          
          System.out.print("Current word: ");
          System.out.println(blanks);
          System.out.print("Guess a letter: ");
          char guessedLetter = scanner.next().charAt(0);

          // Check if the guessed letter is in the word
          boolean found = false;
          for (int i = 0; i < word.length(); i++) {
              if (word.charAt(i) == guessedLetter) {
                  blanks[i] = guessedLetter;
                  found = true;
              }
          }

          if (!found) {
              lives--; 
              System.out.println("Wrong guess. You lost a life. Lives left: " + lives);
              if (lives == 0) {
                  System.out.println("You've run out of lives. Game over.");
                  System.out.println("Correct word is "+ word);
                  break;
              }
          } else {
              
              boolean allFilled = true;
              for (char c : blanks) {
                  if (c == '_') {
                      allFilled = false;
                      break;
                  }
              }
              if (allFilled) {
                  System.out.println("Congratulations! You've guessed the word: " + word);
                  break;
              }
          }
      }
}
}
