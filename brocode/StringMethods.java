class StringMethods{
    public static void main(String[] args){

        String name = "Aditya Saraswat";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");

        name = "Aditya SaraswAt";

        int lastIndex = name.lastIndexOf("A");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);


        name = "     Aditya Saraswat     ";
        name = name.trim();
        System.out.println(name);

        name = name.replace("a","o");
        System.out.println(name);


        name = "";
        System.out.println(name.isEmpty());

        name = "";

        if(name.isEmpty()){
            System.out.println("Your name is empty!");
        }
        else{
            System.out.println("Hello " + name);
        }

        name = "AdityaSaraswat";

        if(name.contains(" ")){
            System.out.println("Your name contains a space!");
        }
        else{
            System.out.println("Your name DOES NOT contains a space!");
        }

        name = "Password";

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be the password");
        }
        else{
            System.out.println("Hello, " + name);
        }
    }
}