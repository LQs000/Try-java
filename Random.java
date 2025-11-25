import java.util.Scanner;
// import java.util.Random;

public class Random {
    public static void main(String[] args) {
        System.out.println("Welcome to Randoms Number Game!");
        System.out.println("Guess the number 1-100...");

        Scanner kb = new Scanner(System.in);
        java.util.Random rd = new java.util.Random();

        String playAgain;

        do {
            System.out.println("\n===New Game===");
            int secretNumber = rd.nextInt(100) + 1;
            int myGuess = 0;
            int atttemps = 0;

            while (myGuess != secretNumber) {
                System.out.print("Input your guess number : ");
                myGuess = kb.nextInt();
                atttemps++;
                if (myGuess <= 0) {
                    System.out.println("Input number 1-100");
                    continue;
                }
                if (myGuess < secretNumber) {
                    System.out.println("Lowwer try again !");
                } else if (myGuess > secretNumber) {
                    System.out.println("Higher try again !");
                } else {
                    System.out.println("That corect!!!! Nice job man!");
                    System.out.println("You Guess " + atttemps + " Times");
                }
            }
            System.out.print("You want to play again? (input y to play again, n to stop)");
            playAgain = kb.next();
        } while (playAgain.equalsIgnoreCase("y"));
        
        System.out.println("Thankyou for playing My game jub jub!");
        kb.close();

    }
}
