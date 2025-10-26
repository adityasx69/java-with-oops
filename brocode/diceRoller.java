import java.util.Scanner;
import java.util.Random;

class diceRoller{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = -1;
        int sum = 0;

        while(num <= 0){
        System.out.print("Enter the # of dice roles: ");
        num = scanner.nextInt();
        }

        for (int i= 0; i<num; i++){
            System.out.println("****************");
            System.out.println("Rolling the dice");
            System.out.println("****************");
            int roll = random.nextInt(1,7);
            printDice(roll);
            System.out.println("You rolled: " + roll);
            sum += roll;
        }

        System.out.println("The total of all the rolls is " + sum);
    }

    static void printDice(int roll){

        String dice1 = """
                     -------
                    |       |
                    |   •   |
                    |       |
                     -------
                       """;
        String dice2 = """
                     -------
                    | •     |
                    |       |
                    |     • |
                     -------
                       """;
        String dice3 = """
                     -------
                    | •     |
                    |   •   |
                    |     • |
                     -------
                       """;
        String dice4 = """
                     -------
                    | •   • |
                    |       |
                    | •   • |
                     -------
                       """;
        String dice5 = """
                     -------
                    | •   • |
                    |   •   |
                    | •   • |
                     -------
                       """;
        String dice6 = """
                     -------
                    | •   • |
                    | •   • |
                    | •   • |
                     -------
                       """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
        }

    }
}