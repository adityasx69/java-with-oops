import java.util.Scanner;

class ShoppingCart{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        char currency = '$';

        System.out.print("What item would you like to buy: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like: ");
        int quantity = scanner.nextInt();

        double total_price = price * quantity;

        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total_price);

        scanner.close();

    }
}