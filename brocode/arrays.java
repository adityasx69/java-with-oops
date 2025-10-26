import java.util.Arrays;

class arrays{
    public static void main(String[] args){
    
    String[] fruits = {"apple","banana","watermelon"};

    fruits[0] = "orange";
    System.out.println(fruits[0]);

    int length = fruits.length;

    System.out.println(length);
    }

    // method 1 of printing array
    for (int i=0; i < fruits.length; i++){
        System.out.println(fruits[i]);
    }


    // method 2 of printing array
    for (String fruit : fruits){
        System.out.println(fruit);
    }

    Arrays.sort(fruits);

    for (String fruit : fruits){
        System.out.println(fruit);
    }

    Arrays.fill(fruits, "coconut");

    for (String fruit : fruits){
        System.out.println(fruit);
    }
}
}