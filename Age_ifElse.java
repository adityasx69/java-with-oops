import java.util.Scanner;

class Age_ifElse{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student (true/false): ");
        Boolean isStudent = scanner.nextBoolean();

        // for name
        if(name.isEmpty()){
            System.out.println("You did'nt enter your name!");
        }
        else{
            System.out.println("Your name is " + name);
        }

        // for age
        if(age > 65){
            System.out.println("You are a senior!");
        }
        else if(age > 18){
            System.out.println("You are an adult!");
        }
        else if(age > 10){
            System.out.println("You are a child!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else if(age < 0){
            System.out.println("You are not born yet!");
        }

        // for student 
        if(isStudent == true){
            System.out.println("You are a Student!");
        }
        else{
            System.out.println("You are NOT a Student!");
        }
    }
}