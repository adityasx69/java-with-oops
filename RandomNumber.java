import java.util.Random;

class RandomNumber{
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1,101);
        number2 = random.nextInt(1,101);
        number3 = random.nextInt(1,101);

        System.out.println("Random Integers: ");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println();


        Double number4;
        Double number5;
        Double number6;

        number4 = random.nextDouble(1,101);
        number5 = random.nextDouble(1,101);
        number6 = random.nextDouble(1,101);

        System.out.println("Random Doubles");
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println();


        Boolean boolean1;
        Boolean boolean2;
        Boolean boolean3;

        boolean1 = random.nextBoolean();
        boolean2 = random.nextBoolean();
        boolean3 = random.nextBoolean();

        System.out.println("Random Boolean");
        System.out.println(boolean1);
        System.out.println(boolean2);
        System.out.println(boolean3);
        System.out.println();
    }
}