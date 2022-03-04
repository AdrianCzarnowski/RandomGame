import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's the party started. Your task to do is guess correct number in max 5 attempts:");
        System.out.println("Give me first try :)");

        int numberToGuess = new Random().nextInt(100);

        boolean guessed = false;

        for (int numberOfAttempts = 0; numberOfAttempts < 5; numberOfAttempts++) {
            int userInput = sc.nextInt();

            if (userInput == numberToGuess) {
                guessed = true;
                break;
            }

            int tries = 4 - numberOfAttempts;
            if (tries > 0) {
                if (userInput > numberToGuess)
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                else System.out.println("Your number is LOWER than the one you are trying to guess");
                System.out.println(tries + " attempts you left");
                System.out.println("Please try again");
            }
        }

        if (guessed) System.out.println("You guessed");
        else System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);

        sc.close();
    }
}
