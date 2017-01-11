package examples.number;

import java.util.Scanner;

public class NumberGuess {

    private static final int number = (int) (Math.random() * 100);

    public static void guessNumber() {
        System.out.println("You have 5 attempts to guess a value ranging from 0 to 100.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 7; i > 0 ; i--) {
            System.out.print("\nRremaining attempts: " + i + ". Please, input you number: ");
            int userNumber = scanner.nextInt();
            if (number == userNumber) {
                System.out.println("You guessed. The number was: " + userNumber);
                return;
            } else {
                if (number > userNumber) {
                    System.out.println("Guess number more.");
                } else {
                    System.out.println("Guess number less.");
                }
                System.out.println("Please, repeat.");
            }
        }
        System.out.println("Number guess was: " + number);
    }

    public static void main(String[] args) {
        NumberGuess.guessNumber();
    }

}
