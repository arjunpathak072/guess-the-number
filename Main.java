
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

    }
}