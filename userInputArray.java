import java.util.Scanner;

class userInputArray{
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the # of food you want: ");
    int size = scanner.nextInt();
    scanner.nextLine();

    String food[] = new String[size];

    for (int i=0; i<food.length; i++){
        System.out.print("Enter a food: ");
        food[i] = scanner.nextLine();
    }

    for (int i=0; i<food.length; i++){
        System.out.println(food[i]);
    }

    }
}