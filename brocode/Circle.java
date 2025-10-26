import java.util.Scanner;

class Circle{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double circumference,area,volume;

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        // System.out.println("The circumference is " + circumference);
        // System.out.println("The area is " + area);
        // System.out.println("The volume is " + volume);

        System.out.printf("The circumference is %.2f\n" ,circumference);
        System.out.printf("The area is %.2f\n" ,area);
        System.out.printf("The volume is %.2f\n" ,volume);
    }
} 