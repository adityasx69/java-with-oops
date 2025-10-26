import java.util.Scanner;

class bankingProgram{

    static char currency = '$';
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double balance = 0;
        boolean isRunning = true;

        while(isRunning){
        
        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println( "3. Withdraw");
        System.out.println("4. Exit");

        System.out.println("***************");

        int choice = -1;

        while(choice <= 0 || choice > 4){
        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();
        }

        if (choice == 1){
            showBalance(balance);
        }

        else if (choice == 2){
            double depositAmount = deposit();

            if (depositAmount < 0){
                System.out.printf("***************\n");
                System.out.println("Amount cannot be negative");
            }
            else{
                balance = balance + depositAmount;
            }
        }

        else if (choice == 3){
            double withdrawAmount = withdraw();

            if (withdrawAmount > balance){
                System.out.printf("***************\n");
                System.out.println("INVALID");
            }
            else if (withdrawAmount < 0){
                System.out.printf("***************\n");
                System.out.println("Amount cannot be negative");
            }
            else{
                balance = balance - withdrawAmount;
            }
        }

        else if (choice == 4){
            isRunning = false;
            exit();
        }
    }
}

    static void showBalance(double balance){
            System.out.printf("***************\n");
            System.out.printf("%c%.2f\n",currency,balance);
    }

    static double deposit(){
            System.out.print("Enter the amount to deposit: ");
            double depositAmount = scanner.nextDouble();

            return depositAmount;
    }

    static double withdraw(){
            System.out.print("Enter the amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();

            return withdrawAmount;
    }

    static void exit(){
            System.out.println("Thank you for using our banking program. Goodbye!");
    }
}