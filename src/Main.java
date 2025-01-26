import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAM

        // DECLARE VARIABLES

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        // GET # OF DICE FROM THE USER

        System.out.printf("Enter the # of dice to roll: ");
        numOfDice = sc.nextInt();

        // CHECK IF # OF DICE > 0

        if (numOfDice > 0) {
            // ROLL ALL THE DICE
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDice(roll);
                System.out.println("-> You rolled: " + roll);
                total += roll;
            }
            // GET THE TOTAL
            System.out.println("Total: " + total);

        } else {
            System.out.println("# of dice must be greater than 0");
        }

        // DISPLAY ASCII OF DICE
        sc.close();
    }

    static void printDice(int roll) {

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.printf(dice1);
            case 2 -> System.out.printf(dice2);
            case 3 -> System.out.printf(dice3);
            case 4 -> System.out.printf(dice4);
            case 5 -> System.out.printf(dice5);
            case 6 -> System.out.printf(dice6);
            default -> System.out.printf("Invalid roll");
        }

    }
}