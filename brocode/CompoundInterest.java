import java.util.Scanner;

class CompoundInterest{
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the principal amount: ");
    double principal = scanner.nextDouble();

    System.out.print("Enter the rate of interest: ");
    double rate = scanner.nextDouble() / 100;

    System.out.print("Enter the # of times compound per year : ");
    int compoundYear = scanner.nextInt();

    System.out.print("Enter the # of years : ");
    int year = scanner.nextInt();

    double amount = principal * Math.pow(1 + (rate/compoundYear),compoundYear * year);

    System.out.printf("The amount after %d year/s is $%.2f\n", year, amount);
    }
}