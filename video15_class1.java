import java.util.Scanner;

class video15_class1{
    public static void main (String args[]) {
        
        Scanner input = new Scanner(System.in);
        video15_class2 object = new video15_class2();
        
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        
        object.simpleMessage(name);
    }
}