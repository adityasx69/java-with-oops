import java.util.Scanner;

class WeightConverter{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program!");

        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        if(option == 1){
            System.out.print("Enter the weight in lbs: ");
            double weightLbs = scanner.nextDouble();

            double FinalWeight = weightLbs * 0.4536;
            System.out.printf("%.2f lbs in kgs is %.2f\n", weightLbs, FinalWeight );
        }
        else if(option == 2){
            System.out.print("Enter the weight in kgs: ");
            double weightKgs = scanner.nextDouble();

            double FinalWeight = weightKgs * 2.205;
            System.out.printf("%.2f kgs in lbs is %.2f\n", weightKgs, FinalWeight );
        }
        else{
            System.out.println("Choose the correct option!");
        }
    }
}