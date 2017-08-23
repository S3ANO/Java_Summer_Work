import java.util.Random;

class video26_class1{
    public static void main (String args[]) {
        Random dice = new Random();
        int number;

        for(int counter = 1; counter <= 10; counter++) {
            number = 1 + dice.nextInt(6); //normally counts from 0 to 5, but adding 1 allows us to use 1 to 6.
            System.out.println(number + " ");
        }
    }
}