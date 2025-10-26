import java.util.Scanner;

class EnhancedSwitches{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        // method 1

        switch(day){
            case "Monday" -> System.out.println("It is a Weekday!");
            case "Tueday" -> System.out.println("It is a Weekday!");
            case "Wednesday" -> System.out.println("It is a Weekday!");
            case "Thursday" -> System.out.println("It is a Weekday!");
            case "Friday" -> System.out.println("It is a Weekday!");
            case "Saturday" -> System.out.println("It is the Weekend!");
            case "Sunday" -> System.out.println("It is a Weekend!");
            default -> System.out.println(day + " is NOT a day!");
        }

        // method 2

        switch(day){
            case "Monday","Tueday","Wednesday","Thursday","Friday" 
                -> System.out.println("It is a Weekday!");
            case "Saturday","Sunday" 
                -> System.out.println("It is a Weekend!");
            default -> System.out.println(day + " is NOT a day!");
        }

    }
}