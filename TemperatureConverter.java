import java.util.Scanner;

class TemperatureConverter{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter!");

        System.out.print("Convert to Celcius or Fahrenheit (C Or F): ");
        String option = scanner.nextLine();

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        if(option.equalsIgnoreCase("F")){
            double far = (9.0/5.0) * temp + 32;
            System.out.printf("The temp in Fahrenheit is %.2f\n", far);
        }
        else if(option.equalsIgnoreCase("C")){
            double cel = (temp - 32) * (5.0/9.0);
            System.out.printf("The temp in Celcius is %.2f\n", cel);
        }
        else{
            System.out.println("Choose the correct option!");
        }

        scanner.close();
    }
}