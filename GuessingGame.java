import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        int guess;
        boolean win = false;
        while(!win){
            guess = input.nextInt();
            numberOfTries += 1;
            if(guess == numberToGuess){
                System.out.println("Bingo!");
                win = true;
            }
            else if(guess > numberToGuess)
                System.out.println("Too high");
            else
                System.out.println("Too low");
        }
        System.out.println("You guessed for " + numberOfTries + " tries");
    }
}
