import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("0 - Rock");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissors");
        System.out.print("Enter your choice: ");

        int userChoice = scanner.nextInt();

        // Validate input
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice! Please enter 0, 1, or 2.");
            return;
        }

        int computerChoice = random.nextInt(3);

        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("It's a Tie!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }

        scanner.close();
    }
}
