class methodOverloading{
    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));
        System.out.println();
        System.out.println(pizza("flat bread"));
        System.out.println(pizza("flat bread", "mozzarella"));
        System.out.println(pizza("flat bread", "mozzarella", "pepperoni"));
    }

    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }

    static String pizza(String bread){
        return bread;
    }

    static String pizza(String bread, String cheese){
        return cheese + " " + bread;
    }

    static String pizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread;
    }
} 