import java.util.Scanner;

class Substrings{
    public static void main(String[] args){

        // String email = "adityas@gmail.com";
        // String username = email.substring(0,7);
        // String domain = email.substring(8);

        // System.out.println("Your username is " + username);
        // System.out.println("The domain of your email address is " + domain);


        // email = "adityassx@gmail.com";
        // username = email.substring(0,email.indexOf("@"));
        // domain = email.substring(email.indexOf("@") + 1);

        // System.out.println("Your username is " + username);
        // System.out.println("The domain of your email address is " + domain);

        Scanner scanner = new Scanner(System.in);

        String emailAddress;
        System.out.print("Enter your email address: ");
        emailAddress = scanner.nextLine();

        if(emailAddress.contains("@")){
        String usernameOfEmail = emailAddress.substring(0,emailAddress.indexOf("@"));
        String domainOfEmail = emailAddress.substring(emailAddress.indexOf("@") + 1);

        System.out.println("Your username is " + usernameOfEmail);
        System.out.println("The domain of your email address is " + domainOfEmail);

        }
        else{
            System.out.println("Email does not contain an @!");
        }

        scanner.close();
    }
}