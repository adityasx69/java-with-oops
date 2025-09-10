class variableScope{

    static int x = 1;

    public static void main(String[] args){

        System.out.println(x);

        int x = 2;

        System.out.println(x);

        doSomething();

    }

    static void doSomething(){
        int x = 3;
        System.out.println(x);
    }
}