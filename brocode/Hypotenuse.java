import java.util.Scanner;

class Hypotenuse{
    public static void main(String[] args){
        // c = (a² + b²)

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The value of hypotenuse c is " + c);

    }
}