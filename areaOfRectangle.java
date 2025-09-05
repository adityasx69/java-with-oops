import java.util.Scanner;

class areaOfRectangle{
    public static void main(String[] args){
        double length,width;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is " + area);

        scanner.close();
    }
}