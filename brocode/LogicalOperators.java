import java.util.Scanner;

class LogicalOperators{
    public static void main(String[] args){
        double temp = 10;
        boolean isSunny = false;

        if (temp <= 30 && temp > 0 && isSunny){
            System.out.println("The weather is GOOD!");
            System.out.println("It is SUNNY outside!");
        }
        else if(temp <= 30 && temp > 0 && !isSunny){
            System.out.println("The weather is GOOD!");
            System.out.println("It is CLOUDY outside!");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is BAD!");
        }

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters!");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores!");
        }
        else{
            System.out.println("Hello, " + username);
        }
    }
}