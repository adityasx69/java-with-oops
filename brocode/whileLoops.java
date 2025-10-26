import java.util.Scanner;

class whileLoops{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Eg 1

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello, "+ name);

        // Eg 2

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game!");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game!");

        // Eg 3

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age<0){
            System.out.println("Your age can't be negative!");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("Your age is " + age);

    }
}