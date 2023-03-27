
import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        int difficultyMode, tries = 5, choice = 1;

        System.out.println("\nWelcome to the guessing game: \n");
        System.out.println("1 => Easy\n2 => Hard\n3 => Harder\n4 => Hardest");

        do {
            System.out.print("\nPlease enter your desired diffculty setting (1 through 4): ");
            difficultyMode = sc.nextInt();
        } while (difficultyMode > 4);
        switch (difficultyMode) {
            case 1:
                tries = 5;
                break;

            case 2:
                tries = 4;
                break;

            case 3:
                tries = 3;
                break;

            case 4:
                tries = 2;
                break;
        }
	System.out.println("You will get " + tries + " attempts to guess the number between 1 and 10");
        int chosenNumber = ra.nextInt(10);

        for (int i = tries; i > 0; i--) {

            do {
                System.out.print("\nEnter the number between 0 and 10: ");
                choice = sc.nextInt();
            } while (choice > 10);

            if (choice == chosenNumber) {
                System.out.println("Hurray! you guessed it right!");
                break;
            }

            else if (i == 1) {
                System.out.println("You are out of tries, the number was: " + chosenNumber);
            }

            else {
                if (Math.abs(chosenNumber - choice) <= 2) {
                    System.out.println("Oof! That was really close");
                }

                else {
                    System.out.println("Tough luck! give that one more shot");
                }
                System.out.println("Tries remaining: " + (i - 1));
            }

        }
    }
}