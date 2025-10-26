import java.util.Scanner;
import java.util.Random;

class numberGuessing{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessing Game!");
        System.out.printf("Enter a number between %d-%d\n",min,max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try Again!");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try Again!");
            }
            else{
                System.out.println("CORRECT! The guess was " + randomNumber);
                System.out.println("# of attemps: " + attempts);
            }
        }while(guess != randomNumber);
    }
}