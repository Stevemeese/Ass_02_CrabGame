import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();


        System.out.println("Welcome to Craps! Would you like to play? (yes/no)");
        String playAgain = scanner.nextLine().toLowerCase();


        while (playAgain.equals("yes")) {

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int roll = die1 + die2;

            System.out.println("You rolled: " + die1 + " + " + die2 + " = " + roll);


            if (roll == 7 || roll == 11) {
                System.out.println("You win!");
            } else if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("Craps! You lose.");
            } else {
                int point = roll;
                System.out.println("Your point is: " + point);

                boolean keepRolling = true;
                while (keepRolling) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    roll = die1 + die2;

                    System.out.println("You rolled: " + die1 + " + " + die2 + " = " + roll);

                    if (roll == point) {
                        System.out.println("You hit the point! You win!");
                        keepRolling = false;
                    } else if (roll == 7) {
                        System.out.println("You rolled a 7. You lose.");
                        keepRolling = false;
                    }
                }
            }

            System.out.println("Would you like to play again? (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
        }


        System.out.println("Thanks for playing Craps!");
    }
}