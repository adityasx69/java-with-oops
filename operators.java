class operators{
    public static void main(String[] args){
        int x = 10;
        int y = 3;

        int z1 = x + y;
        int z2 = x - y; 
        int z3 = x * y;
        int z4 = x / y;
        int z5 = x % y;
 
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);
        System.out.println(z5);

        System.out.println("\nAugented dataypes: \n");


        // Augmented

        x += y;
        System.out.println(x);
        x -= y; 
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        x %= y;
        System.out.println(x);

    }
}