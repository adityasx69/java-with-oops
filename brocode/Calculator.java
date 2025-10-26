import java.util.Scanner;

class Calculator{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        String operator = scanner.next();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        boolean valid = true;

        switch (operator){
            case "+" -> result = num1 + num2;

            case "-" -> result = num1 - num2;

            case "*" -> result = num1 * num2;

            case "/" -> {if(num2 == 0){
                System.out.println("Cannot divide by zero!");
                valid = false;
            }
            else{
                result = num1 / num2;
            }}

            case "^" -> result = Math.pow(num1,num2);

            default ->  {
                        System.out.print("Invalid Operator!");
                        valid = false;
                        }
        }
            if(valid){
                System.out.println(result);
            }
    }
}