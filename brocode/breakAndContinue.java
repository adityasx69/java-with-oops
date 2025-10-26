class breakAndContinue{
    public static void main(String[] args){

        for (int i = 1; i < 11; i++){

            if(i == 5){
                break;
            }

            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i < 11; i++){

            if(i == 7){
                continue;
            }

            System.out.print(i + " ");
        }

    }
}