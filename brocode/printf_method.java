class printf_method{
    public static void main(String[] args){
        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // printf() = method used to format output

        // %[flags][width][.precision][specifier-character]

        System.out.printf("Hello %s\n", name);
        System.out.printf("First letter of your name is %c\n", firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        // precision

        double price1 = 9.99;
        double price2 = 100.34;
        double price3 = 24.23;

        System.out.printf("%.2f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);

        // flags

        double price4 = 9.99;
        double price5 = 100.34;
        double price6 = -24.23;

        // + = output a plus
        System.out.printf("%+.2f\n", price4);
        System.out.printf("%+.2f\n", price5);
        System.out.printf("%+.2f\n", price6);

        double price7 = 90000.99;
        double price8 = 10000.34;
        double price9 = 2400000.23;

        // , = comma after thousands,million etc

        System.out.printf("%,.2f\n", price7);
        System.out.printf("%,.2f\n", price8);
        System.out.printf("%,.2f\n", price9);

        // ( = negative numbers in ()

        System.out.printf("%(.2f\n", price4);
        System.out.printf("%(.2f\n", price5);
        System.out.printf("%(.2f\n", price6);

        // space = minus if negative, space if positive

        System.out.printf("% .2f\n", price4);
        System.out.printf("% .2f\n", price5);
        System.out.printf("% .2f\n", price6);

        // width

        int id1 = 1;
        int id2 = 12;
        int id3 = 153;
        int id4 = 1324;

        // 0 padding

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        // number padding

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        // negative numebr padding

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}