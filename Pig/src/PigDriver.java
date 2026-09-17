import java.util.Scanner;
public class PigDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dice die = new Dice(6);

        int stanScore = 0;
        int ollieScore = 0;

        System.out.println("Welcome to Pig");

        while (stanScore < 100 && ollieScore < 100) {
            int turnTotal = 0;
            boolean stanTurn = true;

            System.out.println("\nStan's turn");
            while (stanTurn) {
                System.out.println("Roll or hold? Enter r or h");
                String choice = input.nextLine();

                if (choice.equals("r")) {
                    die.roll();
                    int roll = die.getFaceValue();

                    System.out.println("You rolled: " + roll);

                    if (roll == 1) {
                        System.out.println("Turn over!");
                        turnTotal = 0;
                        stanTurn = false;
                    } else {
                        turnTotal = turnTotal + roll;

                        System.out.println("Turn total: " + turnTotal);
                    }
                } else if (choice.equals("h")) {
                    stanScore = stanScore + turnTotal;

                    System.out.println("Stan score: " + stanScore);

                    stanTurn = false;
                }
            }
            if (stanScore >= 100) {
                break;
            }
            turnTotal = 0;
            boolean ollieTurn = true;

            System.out.println("\nOllie's turn");
            while (ollieTurn) {


                System.out.println("Roll or hold? Enter r or h");
                String choice = input.nextLine();

                if (choice.equals("r")) {
                    die.roll();
                    int roll = die.getFaceValue();

                    System.out.println("You rolled: " + roll);

                    if (roll == 1) {
                        System.out.println("Turn over!");
                        turnTotal = 0;
                        ollieTurn = false;
                    } else {
                        turnTotal = turnTotal + roll;

                        System.out.println("Turn total: " + turnTotal);
                    }
                } else if (choice.equals("h")) {
                    ollieScore = ollieScore + turnTotal;

                    System.out.println("Ollie score: " + ollieScore);

                    ollieTurn = false;
                }
            }


            if (stanScore >= 100) {

                System.out.println("Stan wins!");

            } else {
                System.out.println("Ollie wins!");
            }
            input.close();
        }
    }
}