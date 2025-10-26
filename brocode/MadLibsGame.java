import java.util.Scanner;

class MadLibsGame{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter a verb, past tense: ");
        String verb_pt = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("Today I went to the " + place + " and saw a " + adjective + " " + animal);
        System.out.println("It " + verb_pt + " right in front of me!");
        System.out.println("Then I " + verb + " as fast as I could.");
    }
}