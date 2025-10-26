class TernaryOperator{
    public static void main(String[] args){
        int score = 45;

        // normal method

        if(score >= 60){
            System.out.println("PASS!");
        }
        else{
            System.out.println("FAIL!");
        }

        // ternary operator

        String PassOrFail = (score >= 60) ? "PASS!" : "FAIL!";
        System.out.println(PassOrFail);

        int number = 7;
        String EvenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(EvenOrOdd);

        int hour = 14;
        String timeOfDay = (hour < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

        double income = 60000;
        double tax = (income < 30000) ? 0.25 : 0.5;
        System.out.print(tax);
    }
}