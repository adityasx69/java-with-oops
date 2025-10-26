class methods{
    public static void main(String[] args){
        String name = "Aditya";
        int age = 11;
        String first = "Aditya";
        String last = "Saraswat";
        happyBirthday(name, age);
        System.out.println(square(3));
        System.out.println(cube(3));
        System.out.println(getFullName(first,last));

        if (ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You need to be 18+ to sign up!");
        }
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday " + name + "!");
        System.out.println("You are " + age + " years old!");
    }

    static double square(int number){
        return number * number;
    }

    static double cube(int number){
        return number * number * number;
    }

    static String getFullName(String first,String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }

}